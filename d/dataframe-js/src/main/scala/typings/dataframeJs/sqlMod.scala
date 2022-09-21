package typings.dataframeJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlMod {
  
  /**
    * SQL module for DataFrame, providing SQL-like syntax for data exploration in DataFrames.
    */
  @JSImport("dataframe-js/modules/sql", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SQL {
    /**
      * Start the SQL module.
      * @param df An instance of DataFrame.
      */
    def this(df: typings.dataframeJs.dataframeMod.default) = this()
  }
  object default {
    
    @JSImport("dataframe-js/modules/sql", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Drop or remove a registered table.
      * @param tableName The registered table to drop.
      * @example
      * DataFrame.dropTable('tmp1');
      */
    /* static member */
    inline def dropTable(tableName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dropTable")(tableName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Drop or remove all registered tables.
      * @example
      * DataFrame.dropTables();
      */
    /* static member */
    inline def dropTables(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dropTables")().asInstanceOf[Unit]
    
    /**
      * List all registered tables.
      * @returns A list of the registered tables.
      * @example
      * DataFrame.listTables();
      */
    /* static member */
    inline def listTables(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("listTables")().asInstanceOf[js.Array[Any]]
    
    /**
      * Register a DataFrame as a temporary table.
      * @param df The DataFrame to register.
      * @param tableName The temporary table name.
      * @param [overwrite=false] Overwrite if the table already exists.
      * @example
      * DataFrame.registerTable('tmp', df);
      */
    /* static member */
    inline def registerTable(df: typings.dataframeJs.dataframeMod.default, tableName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTable")(df.asInstanceOf[js.Any], tableName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerTable(df: typings.dataframeJs.dataframeMod.default, tableName: String, overwrite: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTable")(df.asInstanceOf[js.Any], tableName.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Rename a registered table.
      * @param tableName The registered table to rename.
      * @param replacement The new table name.
      * @param [overwrite=false] Overwrite if the table already exists.
      * @example
      * DataFrame.renameTable('tmp1', 'notTmp1');
      */
    /* static member */
    inline def renameTable(tableName: String, replacement: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renameTable")(tableName.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def renameTable(tableName: String, replacement: String, overwrite: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renameTable")(tableName.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Request on a SQL query.
      * @param query A SQL query to request.
      * @returns The result of the query.
      * @example
      * DataFrame.request('SELECT * FROM tmp');
      */
    /* static member */
    inline def request(query: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(query.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  /**
    * SQL module for DataFrame, providing SQL-like syntax for data exploration in DataFrames.
    */
  @js.native
  trait SQL extends StObject {
    
    var df: typings.dataframeJs.dataframeMod.default = js.native
    
    var name: String = js.native
    
    /**
      * Register the DataFrame as temporary table.
      * @param tableName The name of the table.
      * @param [overwrite=false] Overwrite if the table already exists.
      * @example
      * df.sql.register('tmp');
      */
    def register(tableName: String): typings.dataframeJs.dataframeMod.default = js.native
    def register(tableName: String, overwrite: Boolean): typings.dataframeJs.dataframeMod.default = js.native
  }
}
