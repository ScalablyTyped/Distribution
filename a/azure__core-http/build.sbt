organization := "org.scalablytyped"
name := "azure__core-http"
version := "2.2.7-7cc615"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "azure__abort-controller" % "1.1.0-4fe688",
  "org.scalablytyped" %%% "azure__core-auth" % "1.4.0-c5fe18",
  "org.scalablytyped" %%% "azure__core-tracing" % "1.0.1-1ac762",
  "org.scalablytyped" %%% "azure__logger" % "1.0.3-be6f9a",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20211202Z-e3eac4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
