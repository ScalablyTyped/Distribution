organization := "org.scalablytyped"
name := "cacheable-request"
version := "6.0-dt-20190326Z-13db50"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "http-cache-semantics" % "4.0-dt-20190127Z-ce045b",
  "org.scalablytyped" %%% "keyv" % "3.1-dt-20191223Z-390f84",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "responselike" % "1.0-dt-20190127Z-918c1d",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
