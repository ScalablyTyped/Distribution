organization := "org.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181129Z-17d48e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20181116Z-2b9ae7",
  "org.scalablytyped" %%% "babel__parser" % "7.2.2-7d6547",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20181116Z-f33ea4",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181203Z-ca663c",
  "org.scalablytyped" %%% "babel__types" % "7.2.2-d79bcd",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        