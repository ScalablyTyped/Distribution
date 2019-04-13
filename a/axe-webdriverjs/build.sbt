organization := "org.scalablytyped"
name := "axe-webdriverjs"
version := "2.1-dt-20190329Z-b203d8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "axe-core" % "3.2.2-be1fb6",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20190329Z-bd94da",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        