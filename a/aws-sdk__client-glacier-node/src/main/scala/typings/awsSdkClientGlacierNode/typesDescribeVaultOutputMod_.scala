package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeVaultOutputMod_ {
  
  trait DescribeVaultOutput extends StObject {
    
    /**
      * <p>The Universal Coordinated Time (UTC) date when the vault was created. This value should be a string in the ISO 8601 date format, for example <code>2012-03-20T17:03:43.221Z</code>.</p>
      */
    var CreationDate: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The Universal Coordinated Time (UTC) date when Amazon Glacier completed the last vault inventory. This value should be a string in the ISO 8601 date format, for example <code>2012-03-20T17:03:43.221Z</code>.</p>
      */
    var LastInventoryDate: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The number of archives in the vault as of the last inventory date. This field will return <code>null</code> if an inventory has not yet run on the vault, for example if you just created the vault.</p>
      */
    var NumberOfArchives: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Total size, in bytes, of the archives in the vault as of the last inventory date. This field will return null if an inventory has not yet run on the vault, for example if you just created the vault.</p>
      */
    var SizeInBytes: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) of the vault.</p>
      */
    var VaultARN: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the vault.</p>
      */
    var VaultName: js.UndefOr[String] = js.undefined
  }
  object DescribeVaultOutput {
    
    inline def apply(): DescribeVaultOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeVaultOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DescribeVaultOutput] (val x: Self) extends AnyVal {
      
      inline def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setLastInventoryDate(value: String): Self = StObject.set(x, "LastInventoryDate", value.asInstanceOf[js.Any])
      
      inline def setLastInventoryDateUndefined: Self = StObject.set(x, "LastInventoryDate", js.undefined)
      
      inline def setNumberOfArchives(value: Double): Self = StObject.set(x, "NumberOfArchives", value.asInstanceOf[js.Any])
      
      inline def setNumberOfArchivesUndefined: Self = StObject.set(x, "NumberOfArchives", js.undefined)
      
      inline def setSizeInBytes(value: Double): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
      
      inline def setSizeInBytesUndefined: Self = StObject.set(x, "SizeInBytes", js.undefined)
      
      inline def setVaultARN(value: String): Self = StObject.set(x, "VaultARN", value.asInstanceOf[js.Any])
      
      inline def setVaultARNUndefined: Self = StObject.set(x, "VaultARN", js.undefined)
      
      inline def setVaultName(value: String): Self = StObject.set(x, "VaultName", value.asInstanceOf[js.Any])
      
      inline def setVaultNameUndefined: Self = StObject.set(x, "VaultName", js.undefined)
    }
  }
  
  type UnmarshalledDescribeVaultOutput = DescribeVaultOutput
}
