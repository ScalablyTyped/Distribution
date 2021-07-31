organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20200515Z-f3f994"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20200515Z-7fbd38",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20200515Z-9fd40d",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20200515Z-f711a5",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20200515Z-523806")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
