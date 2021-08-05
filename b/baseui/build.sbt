organization := "org.scalablytyped"
name := "baseui"
version := "9.105.0-16c90e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "card-validator" % "8.1.0-2fb518",
  "org.scalablytyped" %%% "credit-card-type" % "9.1.0-179717",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "date-fns" % "2.16.1-dce18d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "styletron-react" % "5.0-dt-20190925Z-5a8146",
  "org.scalablytyped" %%% "styletron-standard" % "2.0-dt-20200731Z-5bfa34")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
