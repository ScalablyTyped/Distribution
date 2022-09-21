package typings.dataframeJs

import typings.std.Generator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dataframe-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * DataFrame data structure providing an immutable, flexible and powerfull way to manipulate data with columns and rows.
    */
  @JSImport("dataframe-js", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.dataframeJs.dataframeMod.default {
    /**
      * Create a new DataFrame.
      * @param data The data of the DataFrame.
      * @param columns The DataFrame column names.
      * @param options Additional options. Example: modules.
      * @example
      * new DataFrame({
      *      'column1': [3, 6, 8],
      *      'column2': [3, 4, 5, 6],
      * }, ['column1', 'column2'])
      *
      * new Data Frame([
      *      [1, 6, 9, 10, 12],
      *      [1, 2],
      *      [6, 6, 9, 8, 9, 12],
      * ], ['c1', 'c2', 'c3', 'c4', 'c5', 'c6'])
      *
      * new DataFrame([
      *      {c1: 1, c2: 6, c3: 9, c4: 10, c5: 12},
      *      {c4: 1, c3: 2},
      *      {c1: 6, c5: 6, c2: 9, c4: 8, c3: 9, c6: 12},
      * ], ['c1', 'c2', 'c3', 'c4', 'c5', 'c6'])
      *
      * new DataFrame(df);
      *
      * new DataFrame(yourData, yourColumns, {modules: [MyOwnModule, MyOtherModule]})
      */
    def this(data: typings.dataframeJs.dataframeMod.DataFrame) = this()
    def this(data: Record[String, Any]) = this()
    def this(data: typings.dataframeJs.dataframeMod.DataFrame, columns: js.Array[Any]) = this()
    def this(data: Record[String, Any], columns: js.Array[Any]) = this()
    def this(data: typings.dataframeJs.dataframeMod.DataFrame, columns: js.Array[Any], options: Any) = this()
    def this(data: typings.dataframeJs.dataframeMod.DataFrame, columns: Unit, options: Any) = this()
    def this(data: Record[String, Any], columns: js.Array[Any], options: Any) = this()
    def this(data: Record[String, Any], columns: Unit, options: Any) = this()
  }
  object default {
    
    @JSImport("dataframe-js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dataframe-js", "default.defaultModules")
    @js.native
    val defaultModules: js.Array[Any] = js.native
    
    /**
      * Create a DataFrame from a comma separated values file. It returns a Promise.
      * @param  pathOrFile A path to the file (url or local) or a browser File object.
      * @param [header=true] A boolean indicating if the csv has a header or not.
      * @example
      * DataFrame.fromCSV('http://myurl/myfile.csv').then(df => df.show())
      * // For browser only
      * DataFrame.fromCSV(myFile).then(df => df.show())
      * // From node.js only
      * DataFrame.fromCSV('/my/absolue/path/myfile.csv').then(df => df.show())
      * DataFrame.fromCSV('/my/absolue/path/myfile.csv', true).then(df => df.show())
      */
    /* static member */
    inline def fromCSV(args: Any*): js.Promise[typings.dataframeJs.dataframeMod.DataFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCSV")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[typings.dataframeJs.dataframeMod.DataFrame]]
    
    /**
      * Create a DataFrame from a delimiter separated values text file. It returns a Promise.
      * @param pathOrFile A path to the file (url or local) or a browser File object.
      * @param sep The separator used to parse the file.
      * @param [header=true] A boolean indicating if the text has a header or not.
      * @example
      * DataFrame.fromDSV('http://myurl/myfile.txt').then(df => df.show())
      * // In browser Only
      * DataFrame.fromDSV(myFile).then(df => df.show())
      * // From node.js only Only
      * DataFrame.fromDSV('/my/absolue/path/myfile.txt').then(df => df.show())
      * DataFrame.fromDSV('/my/absolue/path/myfile.txt', ';', true).then(df => df.show())
      */
    /* static member */
    inline def fromDSV(args: Any*): js.Promise[typings.dataframeJs.dataframeMod.DataFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDSV")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[typings.dataframeJs.dataframeMod.DataFrame]]
    
    /**
      * Create a DataFrame from a JSON file. It returns a Promise.
      * @param  pathOrFile A path to the file (url or local) or a browser File object.
      * @example
      * DataFrame.fromJSON('http://myurl/myfile.json').then(df => df.show())
      * // For browser only
      * DataFrame.fromJSON(myFile).then(df => df.show())
      * // From node.js only
      * DataFrame.fromJSON('/my/absolute/path/myfile.json').then(df => df.show())
      */
    /* static member */
    inline def fromJSON(args: Any*): js.Promise[typings.dataframeJs.dataframeMod.DataFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[typings.dataframeJs.dataframeMod.DataFrame]]
    
    /**
      * Create a DataFrame from a pipe separated values file. It returns a Promise.
      * @param  pathOrFile A path to the file (url or local) or a browser File object.
      * @param [header=true] A boolean indicating if the psv has a header or not.
      * @example
      * DataFrame.fromPSV('http://myurl/myfile.psv').then(df => df.show())
      * // For browser only
      * DataFrame.fromPSV(myFile).then(df => df.show())
      * // From node.js only
      * DataFrame.fromPSV('/my/absolue/path/myfile.psv').then(df => df.show())
      * DataFrame.fromPSV('/my/absolue/path/myfile.psv', true).then(df => df.show())
      */
    /* static member */
    inline def fromPSV(args: Any*): js.Promise[typings.dataframeJs.dataframeMod.DataFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPSV")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[typings.dataframeJs.dataframeMod.DataFrame]]
    
    /**
      * Create a DataFrame from a tab separated values file. It returns a Promise.
      * @param  pathOrFile A path to the file (url or local) or a browser File object.
      * @param [header=true] A boolean indicating if the tsv has a header or not.
      * @example
      * DataFrame.fromTSV('http://myurl/myfile.tsv').then(df => df.show())
      * // For browser only
      * DataFrame.fromTSV(myFile).then(df => df.show())
      * // From node.js only
      * DataFrame.fromTSV('/my/absolue/path/myfile.tsv').then(df => df.show())
      * DataFrame.fromTSV('/my/absolue/path/myfile.tsv', true).then(df => df.show())
      */
    /* static member */
    inline def fromTSV(args: Any*): js.Promise[typings.dataframeJs.dataframeMod.DataFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTSV")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[typings.dataframeJs.dataframeMod.DataFrame]]
    
    /**
      * Create a DataFrame from a delimiter separated values text file. It returns a Promise. Alias of DataFrame.fromDSV.
      * @param  pathOrFile A path to the file (url or local) or a browser File object.
      * @param sep The separator used to parse the file.
      * @param [header=true] A boolean indicating if the text has a header or not.
      * @example
      * DataFrame.fromText('http://myurl/myfile.txt').then(df => df.show())
      * // In browser Only
      * DataFrame.fromText(myFile).then(df => df.show())
      * // From node.js only Only
      * DataFrame.fromText('/my/absolue/path/myfile.txt').then(df => df.show())
      * DataFrame.fromText('/my/absolue/path/myfile.txt', ';', true).then(df => df.show())
      */
    /* static member */
    inline def fromText(args: Any*): js.Promise[typings.dataframeJs.dataframeMod.DataFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[typings.dataframeJs.dataframeMod.DataFrame]]
    
    /**
      * Set the default modules used in DataFrame instances.
      * @param defaultModules DataFrame modules used by default.
      * @example
      * DataFrame.setDefaultModules(SQL, Stat)
      */
    /* static member */
    inline def setDefaultModules(defaultModules: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultModules")(defaultModules.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  }
  
  /**
    * DataFrame data structure providing an immutable, flexible and powerfull way to manipulate data with columns and rows.
    */
  @JSImport("dataframe-js", "DataFrame")
  @js.native
  open class DataFrame protected ()
    extends typings.dataframeJs.dataframeMod.default {
    /**
      * Create a new DataFrame.
      * @param data The data of the DataFrame.
      * @param columns The DataFrame column names.
      * @param options Additional options. Example: modules.
      * @example
      * new DataFrame({
      *      'column1': [3, 6, 8],
      *      'column2': [3, 4, 5, 6],
      * }, ['column1', 'column2'])
      *
      * new Data Frame([
      *      [1, 6, 9, 10, 12],
      *      [1, 2],
      *      [6, 6, 9, 8, 9, 12],
      * ], ['c1', 'c2', 'c3', 'c4', 'c5', 'c6'])
      *
      * new DataFrame([
      *      {c1: 1, c2: 6, c3: 9, c4: 10, c5: 12},
      *      {c4: 1, c3: 2},
      *      {c1: 6, c5: 6, c2: 9, c4: 8, c3: 9, c6: 12},
      * ], ['c1', 'c2', 'c3', 'c4', 'c5', 'c6'])
      *
      * new DataFrame(df);
      *
      * new DataFrame(yourData, yourColumns, {modules: [MyOwnModule, MyOtherModule]})
      */
    def this(data: typings.dataframeJs.dataframeMod.DataFrame) = this()
    def this(data: Record[String, Any]) = this()
    def this(data: typings.dataframeJs.dataframeMod.DataFrame, columns: js.Array[Any]) = this()
    def this(data: Record[String, Any], columns: js.Array[Any]) = this()
    def this(data: typings.dataframeJs.dataframeMod.DataFrame, columns: js.Array[Any], options: Any) = this()
    def this(data: typings.dataframeJs.dataframeMod.DataFrame, columns: Unit, options: Any) = this()
    def this(data: Record[String, Any], columns: js.Array[Any], options: Any) = this()
    def this(data: Record[String, Any], columns: Unit, options: Any) = this()
  }
  object DataFrame {
    
    @JSImport("dataframe-js", "DataFrame")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dataframe-js", "DataFrame.defaultModules")
    @js.native
    val defaultModules: js.Array[Any] = js.native
    
    /**
      * Create a DataFrame from a comma separated values file. It returns a Promise.
      * @param  pathOrFile A path to the file (url or local) or a browser File object.
      * @param [header=true] A boolean indicating if the csv has a header or not.
      * @example
      * DataFrame.fromCSV('http://myurl/myfile.csv').then(df => df.show())
      * // For browser only
      * DataFrame.fromCSV(myFile).then(df => df.show())
      * // From node.js only
      * DataFrame.fromCSV('/my/absolue/path/myfile.csv').then(df => df.show())
      * DataFrame.fromCSV('/my/absolue/path/myfile.csv', true).then(df => df.show())
      */
    /* static member */
    inline def fromCSV(args: Any*): js.Promise[typings.dataframeJs.dataframeMod.DataFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCSV")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[typings.dataframeJs.dataframeMod.DataFrame]]
    
    /**
      * Create a DataFrame from a delimiter separated values text file. It returns a Promise.
      * @param pathOrFile A path to the file (url or local) or a browser File object.
      * @param sep The separator used to parse the file.
      * @param [header=true] A boolean indicating if the text has a header or not.
      * @example
      * DataFrame.fromDSV('http://myurl/myfile.txt').then(df => df.show())
      * // In browser Only
      * DataFrame.fromDSV(myFile).then(df => df.show())
      * // From node.js only Only
      * DataFrame.fromDSV('/my/absolue/path/myfile.txt').then(df => df.show())
      * DataFrame.fromDSV('/my/absolue/path/myfile.txt', ';', true).then(df => df.show())
      */
    /* static member */
    inline def fromDSV(args: Any*): js.Promise[typings.dataframeJs.dataframeMod.DataFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDSV")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[typings.dataframeJs.dataframeMod.DataFrame]]
    
    /**
      * Create a DataFrame from a JSON file. It returns a Promise.
      * @param  pathOrFile A path to the file (url or local) or a browser File object.
      * @example
      * DataFrame.fromJSON('http://myurl/myfile.json').then(df => df.show())
      * // For browser only
      * DataFrame.fromJSON(myFile).then(df => df.show())
      * // From node.js only
      * DataFrame.fromJSON('/my/absolute/path/myfile.json').then(df => df.show())
      */
    /* static member */
    inline def fromJSON(args: Any*): js.Promise[typings.dataframeJs.dataframeMod.DataFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[typings.dataframeJs.dataframeMod.DataFrame]]
    
    /**
      * Create a DataFrame from a pipe separated values file. It returns a Promise.
      * @param  pathOrFile A path to the file (url or local) or a browser File object.
      * @param [header=true] A boolean indicating if the psv has a header or not.
      * @example
      * DataFrame.fromPSV('http://myurl/myfile.psv').then(df => df.show())
      * // For browser only
      * DataFrame.fromPSV(myFile).then(df => df.show())
      * // From node.js only
      * DataFrame.fromPSV('/my/absolue/path/myfile.psv').then(df => df.show())
      * DataFrame.fromPSV('/my/absolue/path/myfile.psv', true).then(df => df.show())
      */
    /* static member */
    inline def fromPSV(args: Any*): js.Promise[typings.dataframeJs.dataframeMod.DataFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPSV")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[typings.dataframeJs.dataframeMod.DataFrame]]
    
    /**
      * Create a DataFrame from a tab separated values file. It returns a Promise.
      * @param  pathOrFile A path to the file (url or local) or a browser File object.
      * @param [header=true] A boolean indicating if the tsv has a header or not.
      * @example
      * DataFrame.fromTSV('http://myurl/myfile.tsv').then(df => df.show())
      * // For browser only
      * DataFrame.fromTSV(myFile).then(df => df.show())
      * // From node.js only
      * DataFrame.fromTSV('/my/absolue/path/myfile.tsv').then(df => df.show())
      * DataFrame.fromTSV('/my/absolue/path/myfile.tsv', true).then(df => df.show())
      */
    /* static member */
    inline def fromTSV(args: Any*): js.Promise[typings.dataframeJs.dataframeMod.DataFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTSV")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[typings.dataframeJs.dataframeMod.DataFrame]]
    
    /**
      * Create a DataFrame from a delimiter separated values text file. It returns a Promise. Alias of DataFrame.fromDSV.
      * @param  pathOrFile A path to the file (url or local) or a browser File object.
      * @param sep The separator used to parse the file.
      * @param [header=true] A boolean indicating if the text has a header or not.
      * @example
      * DataFrame.fromText('http://myurl/myfile.txt').then(df => df.show())
      * // In browser Only
      * DataFrame.fromText(myFile).then(df => df.show())
      * // From node.js only Only
      * DataFrame.fromText('/my/absolue/path/myfile.txt').then(df => df.show())
      * DataFrame.fromText('/my/absolue/path/myfile.txt', ';', true).then(df => df.show())
      */
    /* static member */
    inline def fromText(args: Any*): js.Promise[typings.dataframeJs.dataframeMod.DataFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[typings.dataframeJs.dataframeMod.DataFrame]]
    
    /**
      * Set the default modules used in DataFrame instances.
      * @param defaultModules DataFrame modules used by default.
      * @example
      * DataFrame.setDefaultModules(SQL, Stat)
      */
    /* static member */
    inline def setDefaultModules(defaultModules: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultModules")(defaultModules.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  }
  
  object Errors {
    
    @JSImport("dataframe-js", "Errors.ArgumentTypeError")
    @js.native
    open class ArgumentTypeError protected ()
      extends typings.dataframeJs.errorsMod.ArgumentTypeError {
      def this(input: Any, expected: Any) = this()
    }
    
    @JSImport("dataframe-js", "Errors.FileNotFoundError")
    @js.native
    open class FileNotFoundError protected ()
      extends typings.dataframeJs.errorsMod.FileNotFoundError {
      def this(fileName: Any) = this()
    }
    
    @JSImport("dataframe-js", "Errors.MixedTypeError")
    @js.native
    open class MixedTypeError protected ()
      extends typings.dataframeJs.errorsMod.MixedTypeError {
      def this(types: Any*) = this()
    }
    
    @JSImport("dataframe-js", "Errors.NoSuchColumnError")
    @js.native
    open class NoSuchColumnError protected ()
      extends typings.dataframeJs.errorsMod.NoSuchColumnError {
      def this(column: Any, columns: Any) = this()
    }
    
    @JSImport("dataframe-js", "Errors.SQLParseError")
    @js.native
    open class SQLParseError protected ()
      extends typings.dataframeJs.errorsMod.SQLParseError {
      def this(message: Any) = this()
    }
    
    @JSImport("dataframe-js", "Errors.TableAlreadyExistsError")
    @js.native
    open class TableAlreadyExistsError protected ()
      extends typings.dataframeJs.errorsMod.TableAlreadyExistsError {
      def this(tableName: Any) = this()
    }
    
    @JSImport("dataframe-js", "Errors.WrongSchemaError")
    @js.native
    open class WrongSchemaError protected ()
      extends typings.dataframeJs.errorsMod.WrongSchemaError {
      def this(columns: Any, expected: Any) = this()
    }
    
    @JSImport("dataframe-js", "Errors.WrongTableNameError")
    @js.native
    open class WrongTableNameError protected ()
      extends typings.dataframeJs.errorsMod.WrongTableNameError {
      def this(tableName: Any) = this()
    }
  }
  
  @JSImport("dataframe-js", "GroupedDataFrame")
  @js.native
  open class GroupedDataFrame protected ()
    extends typings.dataframeJs.groupMod.GroupedDataFrame {
    /**
      * Create a GroupedDataFrame. Used in DataFrame.groupBy('columnName').
      * @param df The DataFrame to group by.
      * @param columnName The column used for the group by.
      * @example
      * df.groupBy('column1');
      * //or
      * groupBy(df, ['column1']);
      */
    def this(df: Any, columnNames: Any, groups: Any, hashes: Any) = this()
  }
  
  object Io {
    
    @JSImport("dataframe-js", "Io")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromCSV(pathOrFile: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCSV")(pathOrFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def fromCSV(pathOrFile: Any, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCSV")(pathOrFile.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def fromDSV(pathOrFile: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDSV")(pathOrFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def fromDSV(pathOrFile: Any, sep: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDSV")(pathOrFile.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def fromDSV(pathOrFile: Any, sep: String, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDSV")(pathOrFile.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def fromDSV(pathOrFile: Any, sep: Unit, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDSV")(pathOrFile.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def fromJSON(pathOrFile: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(pathOrFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def fromPSV(pathOrFile: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPSV")(pathOrFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def fromPSV(pathOrFile: Any, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPSV")(pathOrFile.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def fromTSV(pathOrFile: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTSV")(pathOrFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def fromTSV(pathOrFile: Any, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTSV")(pathOrFile.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def fromText(pathOrFile: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(pathOrFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def fromText(pathOrFile: Any, sep: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(pathOrFile.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def fromText(pathOrFile: Any, sep: String, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(pathOrFile.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def fromText(pathOrFile: Any, sep: Unit, header: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(pathOrFile.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def toCSV(df: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toCSV")(df.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def toCSV(df: Any, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toCSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toCSV(df: Any, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toCSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toCSV(df: Any, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toCSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def toDSV(df: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def toDSV(df: Any, sep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toDSV(df: Any, sep: String, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toDSV(df: Any, sep: String, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toDSV(df: Any, sep: String, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toDSV(df: Any, sep: Unit, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toDSV(df: Any, sep: Unit, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toDSV(df: Any, sep: Unit, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toDSV")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def toJSON(df: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(df.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toJSON(df: Any, asCollection: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(df.asInstanceOf[js.Any], asCollection.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toJSON(df: Any, asCollection: Boolean, path: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(df.asInstanceOf[js.Any], asCollection.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toJSON(df: Any, asCollection: Unit, path: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(df.asInstanceOf[js.Any], asCollection.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toPSV(df: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toPSV")(df.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def toPSV(df: Any, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toPSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toPSV(df: Any, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toPSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toPSV(df: Any, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toPSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def toTSV(df: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toTSV")(df.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def toTSV(df: Any, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toTSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toTSV(df: Any, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toTSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toTSV(df: Any, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toTSV")(df.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def toText(df: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def toText(df: Any, sep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toText(df: Any, sep: String, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toText(df: Any, sep: String, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toText(df: Any, sep: String, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toText(df: Any, sep: Unit, header: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toText(df: Any, sep: Unit, header: Boolean, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def toText(df: Any, sep: Unit, header: Unit, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(df.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], header.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  /**
    * Matrix module for DataFrame, providing basic mathematical matrix computations.
    */
  @JSImport("dataframe-js", "Matrix")
  @js.native
  open class Matrix protected ()
    extends typings.dataframeJs.matrixMod.default {
    /**
      * Start the Matrix module.
      * @param df An instance of DataFrame.
      */
    def this(df: typings.dataframeJs.dataframeMod.default) = this()
  }
  
  object Reusables {
    
    @JSImport("dataframe-js", "Reusables")
    @js.native
    val ^ : js.Any = js.native
    
    inline def arrayEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def arrayEqual(a: Any, b: Any, byOrder: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], byOrder.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def chain(data: Any, operations: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(List(data.asInstanceOf[js.Any]).`++`(operations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[Any]]
    
    inline def hashCode_(str: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashCode")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def isArrayOfType(value: Any, ofType: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfType")(value.asInstanceOf[js.Any], ofType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isArrayOfType(value: Any, ofType: Any, index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfType")(value.asInstanceOf[js.Any], ofType.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isNumber(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def iter(data: Any, func: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("iter")(data.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def iter(data: Any, func: Any, abort: js.Function0[Boolean]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("iter")(data.asInstanceOf[js.Any], func.asInstanceOf[js.Any], abort.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def makeGenerator(x: Any): Generator[Any, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeGenerator")(x.asInstanceOf[js.Any]).asInstanceOf[Generator[Any, Unit, Any]]
    
    inline def transpose(table: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(table.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def xContains(stringToFilter: Any, patterns: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("xContains")(List(stringToFilter.asInstanceOf[js.Any]).`++`(patterns.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[Any]]
    
    inline def xReplace(stringToReplace: Any, patterns: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("xReplace")(List(stringToReplace.asInstanceOf[js.Any]).`++`(patterns.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    inline def xSplit(stringToSplit: Any, patterns: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("xSplit")(List(stringToSplit.asInstanceOf[js.Any]).`++`(patterns.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  }
  
  /**
    * Row data structure used into the dataframe-js.
    */
  @JSImport("dataframe-js", "Row")
  @js.native
  open class Row protected ()
    extends typings.dataframeJs.rowMod.default {
    /**
      * Create a new Row.
      * @param data The data of the Row.
      * @param columns The DataFrame column names.
      * @example
      * new Row({
      *      'column1': 3,
      *      'column2': 6,
      * })
      *
      * new Row([3, 6], ['column1', 'column2'])
      *
      * new Row(Row, ['column1', 'column3'])
      */
    def this(data: js.Array[Any], columns: js.Array[Any]) = this()
    def this(data: typings.dataframeJs.rowMod.Row, columns: js.Array[Any]) = this()
    def this(data: Record[String, Any], columns: js.Array[Any]) = this()
  }
  
  /**
    * SQL module for DataFrame, providing SQL-like syntax for data exploration in DataFrames.
    */
  @JSImport("dataframe-js", "SQL")
  @js.native
  open class SQL protected ()
    extends typings.dataframeJs.sqlMod.default {
    /**
      * Start the SQL module.
      * @param df An instance of DataFrame.
      */
    def this(df: typings.dataframeJs.dataframeMod.default) = this()
  }
  object SQL {
    
    @JSImport("dataframe-js", "SQL")
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
    * Stat module for DataFrame, providing basic statistical metrics for numeric columns.
    */
  @JSImport("dataframe-js", "Stat")
  @js.native
  open class Stat protected ()
    extends typings.dataframeJs.statMod.default {
    /**
      * Start the Stat module.
      * @param df An instance of DataFrame.
      */
    def this(df: Any) = this()
  }
  
  object Symbol {
    
    @JSImport("dataframe-js", "Symbol.__columns__")
    @js.native
    val columns: js.Symbol = js.native
    
    @JSImport("dataframe-js", "Symbol.__groups__")
    @js.native
    val groups: js.Symbol = js.native
    
    @JSImport("dataframe-js", "Symbol.__hashes__")
    @js.native
    val hashes: js.Symbol = js.native
    
    @JSImport("dataframe-js", "Symbol.__rows__")
    @js.native
    val rows: js.Symbol = js.native
  }
  
  inline def sqlParser(query: Any, tables: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sqlParser")(query.asInstanceOf[js.Any], tables.asInstanceOf[js.Any])).asInstanceOf[Any]
}
