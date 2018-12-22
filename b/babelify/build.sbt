organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20180611Z-66f0f1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20180611Z-093cd3",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180611Z-728119",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180611Z-7cde49",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180611Z-585f94",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180613Z-7dc4d7",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181029Z-a4d90b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        