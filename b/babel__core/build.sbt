organization := "org.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181129Z-daf2fd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20181115Z-9f987f",
  "org.scalablytyped" %%% "babel__parser" % "7.3.0-54e1d6",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20181115Z-e62c66",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181128Z-645d9d",
  "org.scalablytyped" %%% "babel__types" % "7.3.0-b9f517",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        