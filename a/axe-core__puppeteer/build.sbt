organization := "org.scalablytyped"
name := "axe-core__puppeteer"
version := "4.4.5-f8355b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "axe-core" % "4.5.2-d3a455",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-00fd1d",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1070637-6cacaf",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-c5fb11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "puppeteer" % "19.2.2-41923e",
  "org.scalablytyped" %%% "puppeteer-core" % "19.2.2-2319d5",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3574d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
