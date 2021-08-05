package typings.contentfulManagement

import org.scalablytyped.runtime.StringDictionary
import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.EndAt
import typings.contentfulManagement.anon.MetaSysPropsorganizations
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.QueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usageMod {
  
  @JSImport("contentful-management/dist/typings/entities/usage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapUsage(http: AxiosInstance, data: UsageProps): Usage = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapUsage")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Usage]
  
  inline def wrapUsageCollection(http: AxiosInstance, data: CollectionProp[UsageProps]): Collection[Usage, UsageProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapUsageCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[Usage, UsageProps]]
  
  trait Usage
    extends StObject
       with UsageProps
       with DefaultElements[UsageProps]
  object Usage {
    
    inline def apply(
      dateRange: EndAt,
      metric: UsageMetricEnum,
      sys: MetaSysPropsorganizations,
      toPlainObject: () => UsageProps,
      unitOfMeasure: String,
      usage: Double,
      usagePerDay: StringDictionary[Double]
    ): Usage = {
      val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), unitOfMeasure = unitOfMeasure.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usagePerDay = usagePerDay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Usage]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.contentfulManagementStrings.cda
    - typings.contentfulManagement.contentfulManagementStrings.cma
    - typings.contentfulManagement.contentfulManagementStrings.cpa
    - typings.contentfulManagement.contentfulManagementStrings.gql
  */
  trait UsageMetricEnum extends StObject
  object UsageMetricEnum {
    
    inline def cda: typings.contentfulManagement.contentfulManagementStrings.cda = "cda".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.cda]
    
    inline def cma: typings.contentfulManagement.contentfulManagementStrings.cma = "cma".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.cma]
    
    inline def cpa: typings.contentfulManagement.contentfulManagementStrings.cpa = "cpa".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.cpa]
    
    inline def gql: typings.contentfulManagement.contentfulManagementStrings.gql = "gql".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.gql]
  }
  
  trait UsageProps extends StObject {
    
    /**
      * Range of usage
      */
    var dateRange: EndAt
    
    /**
      * Type of usage
      */
    var metric: UsageMetricEnum
    
    /**
      * System metadata
      */
    var sys: MetaSysPropsorganizations
    
    /**
      * Unit of usage metric
      */
    var unitOfMeasure: String
    
    /**
      * Value of the usage
      */
    var usage: Double
    
    /**
      * Usage per day
      */
    var usagePerDay: StringDictionary[Double]
  }
  object UsageProps {
    
    inline def apply(
      dateRange: EndAt,
      metric: UsageMetricEnum,
      sys: MetaSysPropsorganizations,
      unitOfMeasure: String,
      usage: Double,
      usagePerDay: StringDictionary[Double]
    ): UsageProps = {
      val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], unitOfMeasure = unitOfMeasure.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usagePerDay = usagePerDay.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageProps]
    }
    
    extension [Self <: UsageProps](x: Self) {
      
      inline def setDateRange(value: EndAt): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
      
      inline def setMetric(value: UsageMetricEnum): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      inline def setSys(value: MetaSysPropsorganizations): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      inline def setUnitOfMeasure(value: String): Self = StObject.set(x, "unitOfMeasure", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsagePerDay(value: StringDictionary[Double]): Self = StObject.set(x, "usagePerDay", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsageQuery
    extends StObject
       with QueryOptions {
    
    @JSName("dateRange.endAt")
    var dateRangeDotendAt: js.UndefOr[String] = js.undefined
    
    @JSName("dateRange.startAt")
    var dateRangeDotstartAt: js.UndefOr[String] = js.undefined
    
    var `metric[in]`: js.UndefOr[String] = js.undefined
  }
  object UsageQuery {
    
    inline def apply(): UsageQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsageQuery]
    }
    
    extension [Self <: UsageQuery](x: Self) {
      
      inline def setDateRangeDotendAt(value: String): Self = StObject.set(x, "dateRange.endAt", value.asInstanceOf[js.Any])
      
      inline def setDateRangeDotendAtUndefined: Self = StObject.set(x, "dateRange.endAt", js.undefined)
      
      inline def setDateRangeDotstartAt(value: String): Self = StObject.set(x, "dateRange.startAt", value.asInstanceOf[js.Any])
      
      inline def setDateRangeDotstartAtUndefined: Self = StObject.set(x, "dateRange.startAt", js.undefined)
      
      inline def `setMetric[in]`(value: String): Self = StObject.set(x, "metric[in]", value.asInstanceOf[js.Any])
      
      inline def `setMetric[in]Undefined`: Self = StObject.set(x, "metric[in]", js.undefined)
    }
  }
}
