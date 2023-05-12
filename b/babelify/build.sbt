organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20221103Z-d20397"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20211202Z-8117b9",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20211223Z-bc655e",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20211202Z-b23df4",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20211202Z-c5635d",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20211202Z-f03a35",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20211202Z-c0d41f",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
