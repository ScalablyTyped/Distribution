package typings.cloudflare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cloudflare extends StObject {
  
  var dnsRecords: DNSRecords
  
  var enterpriseZoneWorkersKV: EnterpriseZoneWorkersKV
  
  var enterpriseZoneWorkersKVNamespaces: EnterpriseZoneWorkersKVNamespaces
  
  var enterpriseZoneWorkersRoutes: EnterpriseZoneWorkersRoutes
  
  var enterpriseZoneWorkersScripts: EnterpriseZoneWorkerScripts
  
  var ips: CFIPs
  
  var stream: Stream
  
  var user: User
  
  var zoneCustomHostNames: ZoneCustomHostNames
  
  var zoneSettings: ZoneSettings
  
  var zoneWorkers: ZoneWorkers
  
  var zoneWorkersRoutes: ZoneWorkersRoutes
  
  var zoneWorkersScript: ZoneWorkersScript
  
  var zones: Zones
}
object Cloudflare {
  
  inline def apply(
    dnsRecords: DNSRecords,
    enterpriseZoneWorkersKV: EnterpriseZoneWorkersKV,
    enterpriseZoneWorkersKVNamespaces: EnterpriseZoneWorkersKVNamespaces,
    enterpriseZoneWorkersRoutes: EnterpriseZoneWorkersRoutes,
    enterpriseZoneWorkersScripts: EnterpriseZoneWorkerScripts,
    ips: CFIPs,
    stream: Stream,
    user: User,
    zoneCustomHostNames: ZoneCustomHostNames,
    zoneSettings: ZoneSettings,
    zoneWorkers: ZoneWorkers,
    zoneWorkersRoutes: ZoneWorkersRoutes,
    zoneWorkersScript: ZoneWorkersScript,
    zones: Zones
  ): Cloudflare = {
    val __obj = js.Dynamic.literal(dnsRecords = dnsRecords.asInstanceOf[js.Any], enterpriseZoneWorkersKV = enterpriseZoneWorkersKV.asInstanceOf[js.Any], enterpriseZoneWorkersKVNamespaces = enterpriseZoneWorkersKVNamespaces.asInstanceOf[js.Any], enterpriseZoneWorkersRoutes = enterpriseZoneWorkersRoutes.asInstanceOf[js.Any], enterpriseZoneWorkersScripts = enterpriseZoneWorkersScripts.asInstanceOf[js.Any], ips = ips.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], zoneCustomHostNames = zoneCustomHostNames.asInstanceOf[js.Any], zoneSettings = zoneSettings.asInstanceOf[js.Any], zoneWorkers = zoneWorkers.asInstanceOf[js.Any], zoneWorkersRoutes = zoneWorkersRoutes.asInstanceOf[js.Any], zoneWorkersScript = zoneWorkersScript.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cloudflare]
  }
  
  extension [Self <: Cloudflare](x: Self) {
    
    inline def setDnsRecords(value: DNSRecords): Self = StObject.set(x, "dnsRecords", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseZoneWorkersKV(value: EnterpriseZoneWorkersKV): Self = StObject.set(x, "enterpriseZoneWorkersKV", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseZoneWorkersKVNamespaces(value: EnterpriseZoneWorkersKVNamespaces): Self = StObject.set(x, "enterpriseZoneWorkersKVNamespaces", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseZoneWorkersRoutes(value: EnterpriseZoneWorkersRoutes): Self = StObject.set(x, "enterpriseZoneWorkersRoutes", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseZoneWorkersScripts(value: EnterpriseZoneWorkerScripts): Self = StObject.set(x, "enterpriseZoneWorkersScripts", value.asInstanceOf[js.Any])
    
    inline def setIps(value: CFIPs): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
    
    inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setZoneCustomHostNames(value: ZoneCustomHostNames): Self = StObject.set(x, "zoneCustomHostNames", value.asInstanceOf[js.Any])
    
    inline def setZoneSettings(value: ZoneSettings): Self = StObject.set(x, "zoneSettings", value.asInstanceOf[js.Any])
    
    inline def setZoneWorkers(value: ZoneWorkers): Self = StObject.set(x, "zoneWorkers", value.asInstanceOf[js.Any])
    
    inline def setZoneWorkersRoutes(value: ZoneWorkersRoutes): Self = StObject.set(x, "zoneWorkersRoutes", value.asInstanceOf[js.Any])
    
    inline def setZoneWorkersScript(value: ZoneWorkersScript): Self = StObject.set(x, "zoneWorkersScript", value.asInstanceOf[js.Any])
    
    inline def setZones(value: Zones): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
  }
}
