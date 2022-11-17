organization := "org.scalablytyped"
name := "d3-shape"
version := "3.1-dt-20220624Z-7a209a"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1ae5b5",
  "org.scalablytyped" %%% "std" % "4.9-448261")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
