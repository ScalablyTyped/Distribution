organization := "org.scalablytyped"
name := "babel-plugin-codegen"
version := "4.1.5-32696a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-043aa4",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-bf895e",
  "org.scalablytyped" %%% "babel__parser" % "7.20.0-6157ab",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-1a1261",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-aa17f1",
  "org.scalablytyped" %%% "babel__types" % "7.20.0-d18d74",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "type-fest" % "3.1.0-3dc798")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
