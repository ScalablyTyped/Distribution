package typings.caniuseLite

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("caniuse-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("caniuse-lite", "agents")
  @js.native
  val agents: AgentsByID = js.native
  
  inline def feature(packedFeature: PackedFeature): Feature_ = ^.asInstanceOf[js.Dynamic].applyDynamic("feature")(packedFeature.asInstanceOf[js.Any]).asInstanceOf[Feature_]
  
  inline def region(packedRegion: PackedRegion): StringDictionary[UsageByVersion] = ^.asInstanceOf[js.Dynamic].applyDynamic("region")(packedRegion.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[UsageByVersion]]
  
  trait Agent extends StObject {
    
    /**
      * The agent's name
      */
    var browser: String
    
    /**
      * The agents vendor prefix
      */
    var prefix: String
    
    /**
      * Exceptions to vendor prefix use.
      */
    var prefix_exceptions: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
    
    /**
      * Release dates as seconds since epoch by version.
      */
    var release_date: StringDictionary[js.UndefOr[Double]]
    
    /**
      * Global agent usage by version
      */
    var usage_global: UsageByVersion
    
    /**
      * Version matrix. See [caniuse](https://caniuse.com)
      */
    var versions: js.Array[Any]
  }
  object Agent {
    
    inline def apply(
      browser: String,
      prefix: String,
      release_date: StringDictionary[js.UndefOr[Double]],
      usage_global: UsageByVersion,
      versions: js.Array[Any]
    ): Agent = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], usage_global = usage_global.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Agent]
    }
    
    extension [Self <: Agent](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefix_exceptions(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "prefix_exceptions", value.asInstanceOf[js.Any])
      
      inline def setPrefix_exceptionsUndefined: Self = StObject.set(x, "prefix_exceptions", js.undefined)
      
      inline def setRelease_date(value: StringDictionary[js.UndefOr[Double]]): Self = StObject.set(x, "release_date", value.asInstanceOf[js.Any])
      
      inline def setUsage_global(value: UsageByVersion): Self = StObject.set(x, "usage_global", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: js.Array[Any]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: Any*): Self = StObject.set(x, "versions", js.Array(value*))
    }
  }
  
  /* Inlined std.Readonly<{[id: string] : std.Readonly<caniuse-lite.caniuse-lite.Agent> | undefined}> */
  trait AgentsByID extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.caniuseLite.caniuseLiteStrings.ls
    - typings.caniuseLite.caniuseLiteStrings.rec
    - typings.caniuseLite.caniuseLiteStrings.pr
    - typings.caniuseLite.caniuseLiteStrings.cr
    - typings.caniuseLite.caniuseLiteStrings.wd
    - typings.caniuseLite.caniuseLiteStrings.other
    - typings.caniuseLite.caniuseLiteStrings.unoff
    - java.lang.String
  */
  type FeatureStatus = _FeatureStatus | String
  
  trait Feature_ extends StObject {
    
    /**
      * Agent support matrix for this feature.
      */
    var stats: StatsByAgentID
    
    /**
      * Specification status of the feature.
      */
    var status: FeatureStatus
    
    /**
      * Descriptive title of the feature.
      */
    var title: String
  }
  object Feature_ {
    
    inline def apply(stats: StatsByAgentID, status: FeatureStatus, title: String): Feature_ = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feature_]
    }
    
    extension [Self <: Feature_](x: Self) {
      
      inline def setStats(value: StatsByAgentID): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type PackedFeature = StringDictionary[Any]
  
  type PackedRegion = StringDictionary[Any]
  
  /* Inlined std.Readonly<{[agentID: string] : caniuse-lite.caniuse-lite.SupportStatusByVersion}> */
  trait StatsByAgentID extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.caniuseLite.caniuseLiteStrings.n
    - typings.caniuseLite.caniuseLiteStrings.p
    - typings.caniuseLite.caniuseLiteStrings.u
    - typings.caniuseLite.caniuseLiteStrings.`a x`
    - typings.caniuseLite.caniuseLiteStrings.a
    - typings.caniuseLite.caniuseLiteStrings.`y x`
    - typings.caniuseLite.caniuseLiteStrings.y
    - java.lang.String
  */
  type SupportStatus = _SupportStatus | String
  
  /* Inlined std.Readonly<{[version: string] : caniuse-lite.caniuse-lite.SupportStatus}> */
  trait SupportStatusByVersion extends StObject
  
  /* Inlined std.Readonly<{[version: string] : number | undefined}> */
  trait UsageByVersion extends StObject
  
  trait _FeatureStatus extends StObject
  
  trait _SupportStatus extends StObject
}
