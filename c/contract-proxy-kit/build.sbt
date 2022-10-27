organization := "org.scalablytyped"
name := "contract-proxy-kit"
version := "1.0-dt-20220624Z-9a3e85"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ethers" % "5.7.2-77fbae",
  "org.scalablytyped" %%% "ethersproject__abi" % "5.7.0-0bd149",
  "org.scalablytyped" %%% "ethersproject__abstract-provider" % "5.7.0-701210",
  "org.scalablytyped" %%% "ethersproject__abstract-signer" % "5.7.0-bbe582",
  "org.scalablytyped" %%% "ethersproject__address" % "5.7.0-7ce57b",
  "org.scalablytyped" %%% "ethersproject__basex" % "5.7.0-3fc182",
  "org.scalablytyped" %%% "ethersproject__bignumber" % "5.7.0-e1ffa6",
  "org.scalablytyped" %%% "ethersproject__bytes" % "5.7.0-6c5f4d",
  "org.scalablytyped" %%% "ethersproject__contracts" % "5.7.0-1b6d5c",
  "org.scalablytyped" %%% "ethersproject__hash" % "5.7.0-ca563e",
  "org.scalablytyped" %%% "ethersproject__hdnode" % "5.7.0-f63bff",
  "org.scalablytyped" %%% "ethersproject__json-wallets" % "5.7.0-06ddaf",
  "org.scalablytyped" %%% "ethersproject__logger" % "5.7.0-97442f",
  "org.scalablytyped" %%% "ethersproject__networks" % "5.7.1-5d0f32",
  "org.scalablytyped" %%% "ethersproject__properties" % "5.7.0-b849d8",
  "org.scalablytyped" %%% "ethersproject__providers" % "5.7.2-b3baa3",
  "org.scalablytyped" %%% "ethersproject__sha2" % "5.7.0-8cc297",
  "org.scalablytyped" %%% "ethersproject__signing-key" % "5.7.0-3eb740",
  "org.scalablytyped" %%% "ethersproject__strings" % "5.7.0-080329",
  "org.scalablytyped" %%% "ethersproject__transactions" % "5.7.0-c4dafb",
  "org.scalablytyped" %%% "ethersproject__wallet" % "5.7.0-2f9b42",
  "org.scalablytyped" %%% "ethersproject__web" % "5.7.1-7bd670",
  "org.scalablytyped" %%% "ethersproject__wordlists" % "5.7.0-eb3713",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-2ad085")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
