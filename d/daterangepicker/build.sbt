organization := "org.scalablytyped"
name := "daterangepicker"
version := "3.1-dt-20220329Z-d68d8f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-894e6b",
  "org.scalablytyped" %%% "moment" % "2.29.4-b4e779",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-1d3faa",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
