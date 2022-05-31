organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20200515Z-01eb42"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20200226Z-0dc5a7",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200515Z-391301",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-cf4d86",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20200515Z-29b3d2",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20200902Z-a84816",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-8dc468",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
