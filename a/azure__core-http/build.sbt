organization := "org.scalablytyped"
name := "azure__core-http"
version := "2.2.7-ffee33"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-5b42b7",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-e8b385",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-86fbb7",
  "org.scalablytyped" %%% "azure__logger" % "1.0.3-be6f9a",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20211202Z-ab2ed8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
