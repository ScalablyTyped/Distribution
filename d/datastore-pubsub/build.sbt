organization := "org.scalablytyped"
name := "datastore-pubsub"
version := "6.0.0-cb570f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "datastore-core" % "8.0.2-82b148",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-011631",
  "org.scalablytyped" %%% "err-code" % "3.0.1-95f15f",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-ee1118",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-28bc3a",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-52a3a3",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-43f797",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-7c4942",
  "org.scalablytyped" %%% "libp2p__interface-dht" % "1.0.2-6a4012",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-8a335f",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-22c095",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-66399b",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "3.0.0-419879",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-5a062f",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-cc7cca",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-d92aed",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-bed8fc",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-91995b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
