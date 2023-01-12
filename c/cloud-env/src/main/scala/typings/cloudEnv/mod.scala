package typings.cloudEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cloud-env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cloud-env", "APP_NAME")
  @js.native
  val APP_NAME: MaybeStr = js.native
  
  @JSImport("cloud-env", "HOSTNAME")
  @js.native
  val HOSTNAME: MaybeStr = js.native
  
  @JSImport("cloud-env", "IP")
  @js.native
  val IP: MaybeStr = js.native
  
  @JSImport("cloud-env", "MONGODB_DB_HOST")
  @js.native
  val MONGODB_DB_HOST: MaybeStr = js.native
  
  @JSImport("cloud-env", "MONGODB_DB_PASSWORD")
  @js.native
  val MONGODB_DB_PASSWORD: MaybeStr = js.native
  
  @JSImport("cloud-env", "MONGODB_DB_PORT")
  @js.native
  val MONGODB_DB_PORT: MaybeNum = js.native
  
  @JSImport("cloud-env", "MONGODB_DB_URL")
  @js.native
  val MONGODB_DB_URL: MaybeStr = js.native
  
  @JSImport("cloud-env", "MONGODB_DB_USERNAME")
  @js.native
  val MONGODB_DB_USERNAME: MaybeStr = js.native
  
  @JSImport("cloud-env", "MYSQL_DB_HOST")
  @js.native
  val MYSQL_DB_HOST: MaybeStr = js.native
  
  @JSImport("cloud-env", "MYSQL_DB_PASSWORD")
  @js.native
  val MYSQL_DB_PASSWORD: MaybeStr = js.native
  
  @JSImport("cloud-env", "MYSQL_DB_PORT")
  @js.native
  val MYSQL_DB_PORT: MaybeNum = js.native
  
  @JSImport("cloud-env", "MYSQL_DB_URL")
  @js.native
  val MYSQL_DB_URL: MaybeStr = js.native
  
  @JSImport("cloud-env", "MYSQL_DB_USERNAME")
  @js.native
  val MYSQL_DB_USERNAME: MaybeStr = js.native
  
  @JSImport("cloud-env", "PORT")
  @js.native
  val PORT: MaybeNum = js.native
  
  @JSImport("cloud-env", "POSTGRESQL_DB_HOST")
  @js.native
  val POSTGRESQL_DB_HOST: MaybeStr = js.native
  
  @JSImport("cloud-env", "POSTGRESQL_DB_PASSWORD")
  @js.native
  val POSTGRESQL_DB_PASSWORD: MaybeStr = js.native
  
  @JSImport("cloud-env", "POSTGRESQL_DB_PORT")
  @js.native
  val POSTGRESQL_DB_PORT: MaybeNum = js.native
  
  @JSImport("cloud-env", "POSTGRESQL_DB_URL")
  @js.native
  val POSTGRESQL_DB_URL: MaybeStr = js.native
  
  @JSImport("cloud-env", "POSTGRESQL_DB_USERNAME")
  @js.native
  val POSTGRESQL_DB_USERNAME: MaybeStr = js.native
  
  inline def get(key: String): MaybeStr = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[MaybeStr]
  inline def get(key: String, default_key: String): MaybeStr = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], default_key.asInstanceOf[js.Any])).asInstanceOf[MaybeStr]
  
  trait DefaultSettings extends StObject {
    
    var APP_NAME: js.UndefOr[String] = js.undefined
    
    var HOSTNAME: js.UndefOr[String] = js.undefined
    
    var IP: js.UndefOr[String] = js.undefined
    
    var MONGODB_DB_HOST: js.UndefOr[String] = js.undefined
    
    var MONGODB_DB_PASSWORD: js.UndefOr[String] = js.undefined
    
    var MONGODB_DB_PORT: js.UndefOr[Double] = js.undefined
    
    var MONGODB_DB_URL: js.UndefOr[String] = js.undefined
    
    var MONGODB_DB_USERNAME: js.UndefOr[String] = js.undefined
    
    var MYSQL_DB_HOST: js.UndefOr[String] = js.undefined
    
    var MYSQL_DB_PASSWORD: js.UndefOr[String] = js.undefined
    
    var MYSQL_DB_PORT: js.UndefOr[Double] = js.undefined
    
    var MYSQL_DB_URL: js.UndefOr[String] = js.undefined
    
    var MYSQL_DB_USERNAME: js.UndefOr[String] = js.undefined
    
    var PORT: js.UndefOr[Double] = js.undefined
    
    var POSTGRESQL_DB_HOST: js.UndefOr[String] = js.undefined
    
    var POSTGRESQL_DB_PASSWORD: js.UndefOr[String] = js.undefined
    
    var POSTGRESQL_DB_PORT: js.UndefOr[Double] = js.undefined
    
    var POSTGRESQL_DB_URL: js.UndefOr[String] = js.undefined
    
    var POSTGRESQL_DB_USERNAME: js.UndefOr[String] = js.undefined
  }
  object DefaultSettings {
    
    inline def apply(): DefaultSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultSettings] (val x: Self) extends AnyVal {
      
      inline def setAPP_NAME(value: String): Self = StObject.set(x, "APP_NAME", value.asInstanceOf[js.Any])
      
      inline def setAPP_NAMEUndefined: Self = StObject.set(x, "APP_NAME", js.undefined)
      
      inline def setHOSTNAME(value: String): Self = StObject.set(x, "HOSTNAME", value.asInstanceOf[js.Any])
      
      inline def setHOSTNAMEUndefined: Self = StObject.set(x, "HOSTNAME", js.undefined)
      
      inline def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
      
      inline def setIPUndefined: Self = StObject.set(x, "IP", js.undefined)
      
      inline def setMONGODB_DB_HOST(value: String): Self = StObject.set(x, "MONGODB_DB_HOST", value.asInstanceOf[js.Any])
      
      inline def setMONGODB_DB_HOSTUndefined: Self = StObject.set(x, "MONGODB_DB_HOST", js.undefined)
      
      inline def setMONGODB_DB_PASSWORD(value: String): Self = StObject.set(x, "MONGODB_DB_PASSWORD", value.asInstanceOf[js.Any])
      
      inline def setMONGODB_DB_PASSWORDUndefined: Self = StObject.set(x, "MONGODB_DB_PASSWORD", js.undefined)
      
      inline def setMONGODB_DB_PORT(value: Double): Self = StObject.set(x, "MONGODB_DB_PORT", value.asInstanceOf[js.Any])
      
      inline def setMONGODB_DB_PORTUndefined: Self = StObject.set(x, "MONGODB_DB_PORT", js.undefined)
      
      inline def setMONGODB_DB_URL(value: String): Self = StObject.set(x, "MONGODB_DB_URL", value.asInstanceOf[js.Any])
      
      inline def setMONGODB_DB_URLUndefined: Self = StObject.set(x, "MONGODB_DB_URL", js.undefined)
      
      inline def setMONGODB_DB_USERNAME(value: String): Self = StObject.set(x, "MONGODB_DB_USERNAME", value.asInstanceOf[js.Any])
      
      inline def setMONGODB_DB_USERNAMEUndefined: Self = StObject.set(x, "MONGODB_DB_USERNAME", js.undefined)
      
      inline def setMYSQL_DB_HOST(value: String): Self = StObject.set(x, "MYSQL_DB_HOST", value.asInstanceOf[js.Any])
      
      inline def setMYSQL_DB_HOSTUndefined: Self = StObject.set(x, "MYSQL_DB_HOST", js.undefined)
      
      inline def setMYSQL_DB_PASSWORD(value: String): Self = StObject.set(x, "MYSQL_DB_PASSWORD", value.asInstanceOf[js.Any])
      
      inline def setMYSQL_DB_PASSWORDUndefined: Self = StObject.set(x, "MYSQL_DB_PASSWORD", js.undefined)
      
      inline def setMYSQL_DB_PORT(value: Double): Self = StObject.set(x, "MYSQL_DB_PORT", value.asInstanceOf[js.Any])
      
      inline def setMYSQL_DB_PORTUndefined: Self = StObject.set(x, "MYSQL_DB_PORT", js.undefined)
      
      inline def setMYSQL_DB_URL(value: String): Self = StObject.set(x, "MYSQL_DB_URL", value.asInstanceOf[js.Any])
      
      inline def setMYSQL_DB_URLUndefined: Self = StObject.set(x, "MYSQL_DB_URL", js.undefined)
      
      inline def setMYSQL_DB_USERNAME(value: String): Self = StObject.set(x, "MYSQL_DB_USERNAME", value.asInstanceOf[js.Any])
      
      inline def setMYSQL_DB_USERNAMEUndefined: Self = StObject.set(x, "MYSQL_DB_USERNAME", js.undefined)
      
      inline def setPORT(value: Double): Self = StObject.set(x, "PORT", value.asInstanceOf[js.Any])
      
      inline def setPORTUndefined: Self = StObject.set(x, "PORT", js.undefined)
      
      inline def setPOSTGRESQL_DB_HOST(value: String): Self = StObject.set(x, "POSTGRESQL_DB_HOST", value.asInstanceOf[js.Any])
      
      inline def setPOSTGRESQL_DB_HOSTUndefined: Self = StObject.set(x, "POSTGRESQL_DB_HOST", js.undefined)
      
      inline def setPOSTGRESQL_DB_PASSWORD(value: String): Self = StObject.set(x, "POSTGRESQL_DB_PASSWORD", value.asInstanceOf[js.Any])
      
      inline def setPOSTGRESQL_DB_PASSWORDUndefined: Self = StObject.set(x, "POSTGRESQL_DB_PASSWORD", js.undefined)
      
      inline def setPOSTGRESQL_DB_PORT(value: Double): Self = StObject.set(x, "POSTGRESQL_DB_PORT", value.asInstanceOf[js.Any])
      
      inline def setPOSTGRESQL_DB_PORTUndefined: Self = StObject.set(x, "POSTGRESQL_DB_PORT", js.undefined)
      
      inline def setPOSTGRESQL_DB_URL(value: String): Self = StObject.set(x, "POSTGRESQL_DB_URL", value.asInstanceOf[js.Any])
      
      inline def setPOSTGRESQL_DB_URLUndefined: Self = StObject.set(x, "POSTGRESQL_DB_URL", js.undefined)
      
      inline def setPOSTGRESQL_DB_USERNAME(value: String): Self = StObject.set(x, "POSTGRESQL_DB_USERNAME", value.asInstanceOf[js.Any])
      
      inline def setPOSTGRESQL_DB_USERNAMEUndefined: Self = StObject.set(x, "POSTGRESQL_DB_USERNAME", js.undefined)
    }
  }
  
  type MaybeNum = Double | Unit
  
  type MaybeStr = String | Unit
}
