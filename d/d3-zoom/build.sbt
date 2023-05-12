organization := "org.scalablytyped"
name := "d3-zoom"
version := "3.0-dt-20221230Z-ddd74c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-420d23",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20221230Z-fec0d7",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20230317Z-7acbb7",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
