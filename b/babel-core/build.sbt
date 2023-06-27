organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20211202Z-bdf4dc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20211223Z-97dc26",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20211202Z-c4dc32",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20211202Z-2895b6",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20211202Z-8b7574",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20211202Z-b091d6",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
