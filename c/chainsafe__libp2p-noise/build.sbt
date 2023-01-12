organization := "org.scalablytyped"
name := "chainsafe__libp2p-noise"
version := "10.0.0-965678"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "it-length-prefixed" % "8.0.3-e7923c",
  "org.scalablytyped" %%% "it-pb-stream" % "2.0.2-c357a3",
  "org.scalablytyped" %%% "it-reader" % "6.0.1-f530a3",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-f6f2e3",
  "org.scalablytyped" %%% "libp2p__interface-connection-encrypter" % "3.0.1-08588b",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-b7cd64",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.2-f3e9e0",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-dbe0b0",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "protons-runtime" % "4.0.1-b69761",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-f85bcb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
