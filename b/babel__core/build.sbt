organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190404Z-007368"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-0a782d",
  "org.scalablytyped" %%% "babel__parser" % "7.4.4-cbbba7",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-32ae44",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190311Z-bf2e60",
  "org.scalablytyped" %%% "babel__types" % "7.4.4-f0aecc",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        