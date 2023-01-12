organization := "org.scalablytyped"
name := "datastore-pubsub"
version := "6.0.0-ad5453"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "datastore-core" % "8.0.2-8285e6",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-60582a",
  "org.scalablytyped" %%% "err-code" % "3.0.1-f3781c",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-a82cfe",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-a39b9b",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-9ef610",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-f6f2e3",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-8f57b2",
  "org.scalablytyped" %%% "libp2p__interface-dht" % "1.0.2-b4009b",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-904d51",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-b7cd64",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-dd6cfe",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "3.0.0-e3eaa5",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-0a8bf2",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-dbe0b0",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-cf6b57",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-f85bcb",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-7a2910")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
