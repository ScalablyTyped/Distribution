organization := "org.scalablytyped"
name := "datastore-pubsub"
version := "4.0.2-3c24da"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "datastore-core" % "8.0.2-c421ea",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-011631",
  "org.scalablytyped" %%% "err-code" % "3.0.1-95f15f",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-30d461",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-28bc3a",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-52a3a3",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-43f797",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-c8b0f1",
  "org.scalablytyped" %%% "libp2p__interface-dht" % "1.0.1-f85914",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-2a6d54",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-22cec9",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-c16c2e",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "2.1.0-305919",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-5a062f",
  "org.scalablytyped" %%% "multiformats" % "10.0.0-cc5814",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.1-08d9e6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.2-03d59f",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-96764a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
