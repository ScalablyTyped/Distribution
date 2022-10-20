organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20220913Z-b759f6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20211202Z-96e4c3",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20211223Z-5acc8e",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20211202Z-5b0a8a",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20211202Z-4fc41c",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20211202Z-8a4bcf",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20211202Z-bd16b0",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
