package typings.awsSdk.emrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkSqlJobDriver extends StObject {
  
  /**
    * The SQL file to be executed.
    */
  var entryPoint: js.UndefOr[EntryPointPath] = js.undefined
  
  /**
    * The Spark parameters to be included in the Spark SQL command.
    */
  var sparkSqlParameters: js.UndefOr[SparkSqlParameters] = js.undefined
}
object SparkSqlJobDriver {
  
  inline def apply(): SparkSqlJobDriver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparkSqlJobDriver]
  }
  
  extension [Self <: SparkSqlJobDriver](x: Self) {
    
    inline def setEntryPoint(value: EntryPointPath): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    inline def setSparkSqlParameters(value: SparkSqlParameters): Self = StObject.set(x, "sparkSqlParameters", value.asInstanceOf[js.Any])
    
    inline def setSparkSqlParametersUndefined: Self = StObject.set(x, "sparkSqlParameters", js.undefined)
  }
}
