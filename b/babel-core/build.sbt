organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20180611Z-857677"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180611Z-4b2b71",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180611Z-57a93a",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180611Z-b271d4",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180613Z-59877a",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181029Z-b49145",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        