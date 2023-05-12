organization := "org.scalablytyped"
name := "chartjs-plugin-trendline"
version := "1.0-dt-20220323Z-475ecf"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chart_dot_js" % "4.3.0-79b00d",
  "org.scalablytyped" %%% "kurkle__color" % "0.3.2-46d1f8",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
