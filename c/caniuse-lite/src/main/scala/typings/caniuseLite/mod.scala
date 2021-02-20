package typings.caniuseLite

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("caniuse-lite", "agents")
  @js.native
  val agents: AgentsByID = js.native
  
  @JSImport("caniuse-lite", "feature")
  @js.native
  def feature(packedFeature: PackedFeature): Feature_ = js.native
  
  @JSImport("caniuse-lite", "region")
  @js.native
  def region(packedRegion: PackedRegion): StringDictionary[UsageByVersion] = js.native
  
  @js.native
  trait Agent extends StObject {
    
    /**
      * The agent's name
      */
    var browser: String = js.native
    
    /**
      * The agents vendor prefix
      */
    var prefix: String = js.native
    
    /**
      * Exceptions to vendor prefix use.
      */
    var prefix_exceptions: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
    
    /**
      * Release dates as seconds since epoch by version.
      */
    var release_date: StringDictionary[js.UndefOr[Double]] = js.native
    
    /**
      * Global agent usage by version
      */
    var usage_global: UsageByVersion = js.native
    
    /**
      * Version matrix. See [caniuse](https://caniuse.com)
      */
    var versions: js.Array[js.Any] = js.native
  }
  object Agent {
    
    @scala.inline
    def apply(
      browser: String,
      prefix: String,
      release_date: StringDictionary[js.UndefOr[Double]],
      usage_global: UsageByVersion,
      versions: js.Array[js.Any]
    ): Agent = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], usage_global = usage_global.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Agent]
    }
    
    @scala.inline
    implicit class AgentMutableBuilder[Self <: Agent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix_exceptions(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "prefix_exceptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix_exceptionsUndefined: Self = StObject.set(x, "prefix_exceptions", js.undefined)
      
      @scala.inline
      def setRelease_date(value: StringDictionary[js.UndefOr[Double]]): Self = StObject.set(x, "release_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage_global(value: UsageByVersion): Self = StObject.set(x, "usage_global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersions(value: js.Array[js.Any]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionsVarargs(value: js.Any*): Self = StObject.set(x, "versions", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Readonly<{[id: string] : std.Readonly<caniuse-lite.caniuse-lite.Agent> | undefined}> */
  @js.native
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
  
  @js.native
  trait Feature_ extends StObject {
    
    /**
      * Agent support matrix for this feature.
      */
    var stats: StatsByAgentID = js.native
    
    /**
      * Specification status of the feature.
      */
    var status: FeatureStatus = js.native
    
    /**
      * Descriptive title of the feature.
      */
    var title: String = js.native
  }
  object Feature_ {
    
    @scala.inline
    def apply(stats: StatsByAgentID, status: FeatureStatus, title: String): Feature_ = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feature_]
    }
    
    @scala.inline
    implicit class Feature_MutableBuilder[Self <: Feature_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStats(value: StatsByAgentID): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: FeatureStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type PackedFeature = StringDictionary[js.Any]
  
  type PackedRegion = StringDictionary[js.Any]
  
  /* Inlined std.Readonly<{[agentID: string] : caniuse-lite.caniuse-lite.SupportStatusByVersion}> */
  @js.native
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
  @js.native
  trait SupportStatusByVersion extends StObject
  
  /* Inlined std.Readonly<{[version: string] : number | undefined}> */
  @js.native
  trait UsageByVersion extends StObject
  
  trait _FeatureStatus extends StObject
  
  trait _SupportStatus extends StObject
}
