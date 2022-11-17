organization := "org.scalablytyped"
name := "d3-zoom"
version := "3.0-dt-20220624Z-d59bf2"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-019836",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-5df0c9",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-6af12c",
  "org.scalablytyped" %%% "std" % "4.9-448261")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
