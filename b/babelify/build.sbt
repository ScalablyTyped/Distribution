organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20220913Z-ecb6e5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20211202Z-ff0cfa",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20211223Z-24147c",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20211202Z-280bcf",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20211202Z-6da676",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20211202Z-a43c7f",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20211202Z-50ea8e",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
