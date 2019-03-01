organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190216Z-9aef6d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-b64d61",
  "org.scalablytyped" %%% "babel__parser" % "7.3.4-a31293",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-d14dc2",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190213Z-c21f94",
  "org.scalablytyped" %%% "babel__types" % "7.3.4-e00903",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        