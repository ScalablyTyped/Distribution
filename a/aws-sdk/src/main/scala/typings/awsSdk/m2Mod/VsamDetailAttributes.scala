package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VsamDetailAttributes extends StObject {
  
  /**
    * The alternate key definitions, if any. A legacy dataset might not have any alternate key defined, but if those alternate keys definitions exist, provide them as some applications will make use of them.
    */
  var alternateKeys: js.UndefOr[AlternateKeyList] = js.undefined
  
  /**
    * If set to True, enforces loading the data set into cache before it’s used by the application.
    */
  var cacheAtStartup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether indexes for this dataset are stored as compressed values. If you have a large data set (typically &gt; 100 Mb), consider setting this flag to True.
    */
  var compressed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The character set used by the data set. Can be ASCII, EBCDIC, or unknown.
    */
  var encoding: js.UndefOr[String20] = js.undefined
  
  /**
    * The primary key of the data set.
    */
  var primaryKey: js.UndefOr[PrimaryKey] = js.undefined
  
  /**
    * The record format of the data set.
    */
  var recordFormat: js.UndefOr[String20] = js.undefined
}
object VsamDetailAttributes {
  
  inline def apply(): VsamDetailAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VsamDetailAttributes]
  }
  
  extension [Self <: VsamDetailAttributes](x: Self) {
    
    inline def setAlternateKeys(value: AlternateKeyList): Self = StObject.set(x, "alternateKeys", value.asInstanceOf[js.Any])
    
    inline def setAlternateKeysUndefined: Self = StObject.set(x, "alternateKeys", js.undefined)
    
    inline def setAlternateKeysVarargs(value: AlternateKey*): Self = StObject.set(x, "alternateKeys", js.Array(value*))
    
    inline def setCacheAtStartup(value: Boolean): Self = StObject.set(x, "cacheAtStartup", value.asInstanceOf[js.Any])
    
    inline def setCacheAtStartupUndefined: Self = StObject.set(x, "cacheAtStartup", js.undefined)
    
    inline def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
    
    inline def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
    
    inline def setEncoding(value: String20): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setPrimaryKey(value: PrimaryKey): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setRecordFormat(value: String20): Self = StObject.set(x, "recordFormat", value.asInstanceOf[js.Any])
    
    inline def setRecordFormatUndefined: Self = StObject.set(x, "recordFormat", js.undefined)
  }
}
