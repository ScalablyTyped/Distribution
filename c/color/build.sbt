organization := "org.scalablytyped"
name := "color"
version := "3.0-dt-20200923Z-b8ba85"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20200515Z-50fcf1",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20200515Z-123ec4",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
