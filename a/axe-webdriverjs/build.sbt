organization := "org.scalablytyped"
name := "axe-webdriverjs"
version := "2.3-dt-20201103Z-9201e2"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "axe-core" % "4.1.1-179617",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20201028Z-25e67c",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
