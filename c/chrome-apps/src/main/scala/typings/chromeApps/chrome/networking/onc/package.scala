package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.networking.onc.internal.NetworkConfigBase
import typings.chromeApps.chrome.networking.onc.internal.ObjectFunction
import typings.chromeApps.chromeAppsStrings.full
import typings.chromeApps.chromeAppsStrings.managed
import typings.chromeApps.chromeAppsStrings.partial
import typings.chromeApps.chromeAppsStrings.unmanaged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ManagedBoolean = ManagedType[Boolean]

type ManagedDOMString = ManagedType[String]

type ManagedDOMStringList = ManagedType[js.Array[String]]

type ManagedIPConfigType = ManagedType[js.Array[IPConfigType]]

type ManagedLong = ManagedType[integer]

type ManagedProperties = NetworkProperties[managed, full]

type NetworkConfigProperties[OF /* <: ObjectFunction */] = NetworkConfigBase[unmanaged, full, OF]

type NetworkStateProperties = NetworkProperties[unmanaged, partial]
