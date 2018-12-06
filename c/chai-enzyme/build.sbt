organization := "org.scalablytyped"
name := "chai-enzyme"
version := "0.6.1-dt-20180910Z-60de78"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181027Z-9be48b",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20181126Z-2a23b5",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "enzyme" % "3.1-dt-20181109Z-1845fb",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-dcbd7c",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-65cffa",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        