package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.networking.onc.internal.NetworkConfigBase
import typings.chromeApps.chromeAppsStrings.DevicePolicy
import typings.chromeApps.chromeAppsStrings.Device_
import typings.chromeApps.chromeAppsStrings.None
import typings.chromeApps.chromeAppsStrings.User
import typings.chromeApps.chromeAppsStrings.UserPolicy
import typings.chromeApps.chromeAppsStrings.getter
import typings.chromeApps.chromeAppsStrings.unmanaged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkProperties[M /* <: ManagedObject */, IF /* <: InterfaceType */] extends NetworkConfigBase[M, IF, getter] {
  /** Whether the network is connectable. */
  var Connectable: js.UndefOr[Boolean] = js.native
  /** The network's current connection state. */
  var ConnectionState: js.UndefOr[ConnectionStateType] = js.native
  /** The last recorded network error state. */
  var ErrorState: js.UndefOr[String] = js.native
  /** The network's IP configuration. */
  var IPConfigs: js.UndefOr[
    js.Array[
      IPConfigProperties[
        unmanaged, 
        Boolean | ManagedBoolean, 
        String | ManagedDOMString, 
        js.Array[String] | ManagedDOMStringList, 
        integer | ManagedLong
      ]
    ]
  ] = js.native
  /** The network's MAC address. */
  var MacAddress: js.UndefOr[String] = js.native
  /** The network's proxy settings. */
  var ProxySettings: js.UndefOr[
    typings.chromeApps.chrome.networking.onc.ProxySettings[unmanaged, String | ManagedDOMString, js.Array[String] | ManagedDOMStringList]
  ] = js.native
  /**
    * For a connected network, whether the network connectivity to the Internet is limited,
    * e.g. if the network is behind a portal, or a cellular network is not activated.
    */
  var RestrictedConnectivity: js.UndefOr[Boolean] = js.native
  /** IP configuration that was received from the DHCP server before applying static IP configuration. */
  var SavedIPConfig: js.UndefOr[
    IPConfigProperties[
      unmanaged, 
      Boolean | ManagedBoolean, 
      String | ManagedDOMString, 
      js.Array[String] | ManagedDOMStringList, 
      integer | ManagedLong
    ]
  ] = js.native
  /**
    * Indicates whether and how the network is configured.
    * 'None' conflicts with extension code generation,
    * so we must use a string for 'Source' instead of a SourceType enum.
    */
  var Source: js.UndefOr[Device_ | DevicePolicy | User | UserPolicy | None] = js.native
  /** The network's static IP configuration. */
  var StaticIPConfig: js.UndefOr[
    IPConfigProperties[
      M, 
      Boolean | ManagedBoolean, 
      String | ManagedDOMString, 
      js.Array[String] | ManagedDOMStringList, 
      integer | ManagedLong
    ]
  ] = js.native
}

object NetworkProperties {
  @scala.inline
  def apply[/* <: typings.chromeApps.chrome.networking.onc.ManagedObject */ M, /* <: typings.chromeApps.chrome.networking.onc.InterfaceType */ IF](): NetworkProperties[M, IF] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkProperties[M, IF]]
  }
  @scala.inline
  implicit class NetworkPropertiesOps[Self <: NetworkProperties[_, _], /* <: typings.chromeApps.chrome.networking.onc.ManagedObject */ M, /* <: typings.chromeApps.chrome.networking.onc.InterfaceType */ IF] (val x: Self with (NetworkProperties[M, IF])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectable(value: Boolean): Self = this.set("Connectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectable: Self = this.set("Connectable", js.undefined)
    @scala.inline
    def setConnectionState(value: ConnectionStateType): Self = this.set("ConnectionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionState: Self = this.set("ConnectionState", js.undefined)
    @scala.inline
    def setErrorState(value: String): Self = this.set("ErrorState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorState: Self = this.set("ErrorState", js.undefined)
    @scala.inline
    def setIPConfigsVarargs(
      value: (IPConfigProperties[
          unmanaged, 
          Boolean | ManagedBoolean, 
          String | ManagedDOMString, 
          js.Array[String] | ManagedDOMStringList, 
          integer | ManagedLong
        ])*
    ): Self = this.set("IPConfigs", js.Array(value :_*))
    @scala.inline
    def setIPConfigs(
      value: js.Array[
          IPConfigProperties[
            unmanaged, 
            Boolean | ManagedBoolean, 
            String | ManagedDOMString, 
            js.Array[String] | ManagedDOMStringList, 
            integer | ManagedLong
          ]
        ]
    ): Self = this.set("IPConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPConfigs: Self = this.set("IPConfigs", js.undefined)
    @scala.inline
    def setMacAddress(value: String): Self = this.set("MacAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacAddress: Self = this.set("MacAddress", js.undefined)
    @scala.inline
    def setProxySettings(
      value: ProxySettings[unmanaged, String | ManagedDOMString, js.Array[String] | ManagedDOMStringList]
    ): Self = this.set("ProxySettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxySettings: Self = this.set("ProxySettings", js.undefined)
    @scala.inline
    def setRestrictedConnectivity(value: Boolean): Self = this.set("RestrictedConnectivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictedConnectivity: Self = this.set("RestrictedConnectivity", js.undefined)
    @scala.inline
    def setSavedIPConfig(
      value: IPConfigProperties[
          unmanaged, 
          Boolean | ManagedBoolean, 
          String | ManagedDOMString, 
          js.Array[String] | ManagedDOMStringList, 
          integer | ManagedLong
        ]
    ): Self = this.set("SavedIPConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavedIPConfig: Self = this.set("SavedIPConfig", js.undefined)
    @scala.inline
    def setSource(value: Device_ | DevicePolicy | User | UserPolicy | None): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    @scala.inline
    def setStaticIPConfig(
      value: IPConfigProperties[
          M, 
          Boolean | ManagedBoolean, 
          String | ManagedDOMString, 
          js.Array[String] | ManagedDOMStringList, 
          integer | ManagedLong
        ]
    ): Self = this.set("StaticIPConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticIPConfig: Self = this.set("StaticIPConfig", js.undefined)
  }
  
}

