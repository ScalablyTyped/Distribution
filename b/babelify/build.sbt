organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20180910Z-262825"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20180910Z-e5beea",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180910Z-89cf7d",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180910Z-3d1e50",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180910Z-396ae2",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180910Z-16e86f",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181109Z-8abbdb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        