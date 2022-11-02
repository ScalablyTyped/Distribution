organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20220913Z-473072"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20211202Z-56065d",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20211223Z-a090f2",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20211202Z-b31d97",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20211202Z-1cf1b7",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20211202Z-4487c8",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20211202Z-8bedd6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
