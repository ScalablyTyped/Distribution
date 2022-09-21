package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftTarget extends StObject {
  
  /**
    * The name of the database to write to.
    */
  var Database: EnclosedInStringProperty
  
  /**
    * The nodes that are inputs to the data target.
    */
  var Inputs: OneInput
  
  /**
    * The name of the data target.
    */
  var Name: NodeName
  
  /**
    * The Amazon S3 path where temporary data can be staged when copying out of the database.
    */
  var RedshiftTmpDir: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The name of the table in the database to write to.
    */
  var Table: EnclosedInStringProperty
  
  /**
    * The IAM role with permissions.
    */
  var TmpDirIAMRole: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The set of options to configure an upsert operation when writing to a Redshift target.
    */
  var UpsertRedshiftOptions: js.UndefOr[UpsertRedshiftTargetOptions] = js.undefined
}
object RedshiftTarget {
  
  inline def apply(
    Database: EnclosedInStringProperty,
    Inputs: OneInput,
    Name: NodeName,
    Table: EnclosedInStringProperty
  ): RedshiftTarget = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftTarget]
  }
  
  extension [Self <: RedshiftTarget](x: Self) {
    
    inline def setDatabase(value: EnclosedInStringProperty): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRedshiftTmpDir(value: EnclosedInStringProperty): Self = StObject.set(x, "RedshiftTmpDir", value.asInstanceOf[js.Any])
    
    inline def setRedshiftTmpDirUndefined: Self = StObject.set(x, "RedshiftTmpDir", js.undefined)
    
    inline def setTable(value: EnclosedInStringProperty): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTmpDirIAMRole(value: EnclosedInStringProperty): Self = StObject.set(x, "TmpDirIAMRole", value.asInstanceOf[js.Any])
    
    inline def setTmpDirIAMRoleUndefined: Self = StObject.set(x, "TmpDirIAMRole", js.undefined)
    
    inline def setUpsertRedshiftOptions(value: UpsertRedshiftTargetOptions): Self = StObject.set(x, "UpsertRedshiftOptions", value.asInstanceOf[js.Any])
    
    inline def setUpsertRedshiftOptionsUndefined: Self = StObject.set(x, "UpsertRedshiftOptions", js.undefined)
  }
}
