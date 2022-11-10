organization := "org.scalablytyped"
name := "dc"
version := "4.2-dt-20221026Z-d7d1d4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-4a0944",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-e38452",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-576765",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
