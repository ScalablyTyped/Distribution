organization := "org.scalablytyped"
name := "braft-editor"
version := "1.9-dt-20190311Z-eae9be"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "draft-js" % "v0.10.5-dt-20190329Z-529359",
  "org.scalablytyped" %%% "immutable" % "4.0.0-rc.12-62b8d0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-5f45a9",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        