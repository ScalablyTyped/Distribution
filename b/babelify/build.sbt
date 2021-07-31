organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20200923Z-6969a5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20200226Z-d9798c",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200515Z-cbeb97",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-1c32ff",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20200515Z-15fb89",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20200902Z-1b748f",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-0fd90f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
