organization := "org.scalablytyped"
name := "chainsafe__libp2p-noise"
version := "8.0.1-d97f3e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "it-length-prefixed" % "8.0.2-b77396",
  "org.scalablytyped" %%% "it-pb-stream" % "2.0.2-aa1b47",
  "org.scalablytyped" %%% "it-reader" % "6.0.1-f88ddd",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-255b07",
  "org.scalablytyped" %%% "libp2p__interface-connection-encrypter" % "2.0.1-ecf9f0",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.4-0a9ef2",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.1-153927",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "protons-runtime" % "3.1.0-cd5b4c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.2-2587d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
