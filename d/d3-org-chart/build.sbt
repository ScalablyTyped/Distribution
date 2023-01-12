organization := "org.scalablytyped"
name := "d3-org-chart"
version := "2.6-dt-20220624Z-1505db"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1-dt-20220624Z-b26902",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-cb99f3",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
