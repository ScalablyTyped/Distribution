organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20180611Z-d29976"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20180611Z-b49a2d",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180611Z-371fbc",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180611Z-6daf00",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180611Z-d48c2e",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180613Z-1525e1",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181029Z-a98e88",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        