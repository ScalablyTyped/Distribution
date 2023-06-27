package typings.codemirrorLangSql

import org.scalablytyped.runtime.StringDictionary
import typings.codemirrorAutocomplete.mod.Completion
import typings.codemirrorAutocomplete.mod.CompletionSource
import typings.codemirrorLanguage.mod.LRLanguage
import typings.codemirrorLanguage.mod.LanguageSupport
import typings.codemirrorState.mod.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/lang-sql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Dialect for [Cassandra](https://cassandra.apache.org/)'s SQL-ish query language.
  */
  @JSImport("@codemirror/lang-sql", "Cassandra")
  @js.native
  val Cassandra: SQLDialect = js.native
  
  /**
  SQL dialect for Microsoft [SQL
  Server](https://www.microsoft.com/en-us/sql-server).
  */
  @JSImport("@codemirror/lang-sql", "MSSQL")
  @js.native
  val MSSQL: SQLDialect = js.native
  
  /**
  Variant of [`MySQL`](https://codemirror.net/6/docs/ref/#lang-sql.MySQL) for
  [MariaDB](https://mariadb.org/).
  */
  @JSImport("@codemirror/lang-sql", "MariaSQL")
  @js.native
  val MariaSQL: SQLDialect = js.native
  
  /**
  [MySQL](https://dev.mysql.com/) dialect.
  */
  @JSImport("@codemirror/lang-sql", "MySQL")
  @js.native
  val MySQL: SQLDialect = js.native
  
  /**
  [PL/SQL](https://en.wikipedia.org/wiki/PL/SQL) dialect.
  */
  @JSImport("@codemirror/lang-sql", "PLSQL")
  @js.native
  val PLSQL: SQLDialect = js.native
  
  /**
  Dialect for [PostgreSQL](https://www.postgresql.org).
  */
  @JSImport("@codemirror/lang-sql", "PostgreSQL")
  @js.native
  val PostgreSQL: SQLDialect = js.native
  
  /**
  Represents an SQL dialect.
  */
  @JSImport("@codemirror/lang-sql", "SQLDialect")
  @js.native
  /* private */ open class SQLDialect () extends StObject {
    
    /**
      Returns the language for this dialect as an extension.
      */
    def `extension`: Extension = js.native
    
    /**
      The language for this dialect.
      */
    val language: LRLanguage = js.native
    
    /**
      The spec used to define this dialect.
      */
    val spec: SQLDialectSpec = js.native
  }
  object SQLDialect {
    
    @JSImport("@codemirror/lang-sql", "SQLDialect")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Define a new dialect.
      */
    /* static member */
    inline def define(spec: SQLDialectSpec): SQLDialect = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(spec.asInstanceOf[js.Any]).asInstanceOf[SQLDialect]
  }
  
  /**
  [SQLite](https://sqlite.org/) dialect.
  */
  @JSImport("@codemirror/lang-sql", "SQLite")
  @js.native
  val SQLite: SQLDialect = js.native
  
  /**
  The standard SQL dialect.
  */
  @JSImport("@codemirror/lang-sql", "StandardSQL")
  @js.native
  val StandardSQL: SQLDialect = js.native
  
  /**
  Returns a completion source that provides keyword completion for
  the given SQL dialect.
  */
  inline def keywordCompletionSource(dialect: SQLDialect): CompletionSource = ^.asInstanceOf[js.Dynamic].applyDynamic("keywordCompletionSource")(dialect.asInstanceOf[js.Any]).asInstanceOf[CompletionSource]
  inline def keywordCompletionSource(dialect: SQLDialect, upperCase: Boolean): CompletionSource = (^.asInstanceOf[js.Dynamic].applyDynamic("keywordCompletionSource")(dialect.asInstanceOf[js.Any], upperCase.asInstanceOf[js.Any])).asInstanceOf[CompletionSource]
  
  /**
  Returns a completion sources that provides schema-based completion
  for the given configuration.
  */
  inline def schemaCompletionSource(config: SQLConfig): CompletionSource = ^.asInstanceOf[js.Dynamic].applyDynamic("schemaCompletionSource")(config.asInstanceOf[js.Any]).asInstanceOf[CompletionSource]
  
  /**
  SQL language support for the given SQL dialect, with keyword
  completion, and, if provided, schema-based completion as extra
  extensions.
  */
  inline def sql(): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("sql")().asInstanceOf[LanguageSupport]
  inline def sql(config: SQLConfig): LanguageSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("sql")(config.asInstanceOf[js.Any]).asInstanceOf[LanguageSupport]
  
  /**
  Options used to configure an SQL extension.
  */
  trait SQLConfig extends StObject {
    
    /**
      When given, tables prefixed with this schema name can be
      completed directly at the top level.
      */
    var defaultSchema: js.UndefOr[String] = js.undefined
    
    /**
      When given, columns from the named table can be completed
      directly at the top level.
      */
    var defaultTable: js.UndefOr[String] = js.undefined
    
    /**
      The [dialect](https://codemirror.net/6/docs/ref/#lang-sql.SQLDialect) to use. Defaults to
      [`StandardSQL`](https://codemirror.net/6/docs/ref/#lang-sql.StandardSQL).
      */
    var dialect: js.UndefOr[SQLDialect] = js.undefined
    
    /**
      An object that maps table names, optionally prefixed with a
      schema name (`"schema.table"`) to options (columns) that can be
      completed for that table. Use lower-case names here.
      */
    var schema: js.UndefOr[StringDictionary[js.Array[String | Completion]]] = js.undefined
    
    /**
      Similar to `tables`, if you want to provide completion objects
      for your schemas rather than using the generated ones, pass them
      here.
      */
    var schemas: js.UndefOr[js.Array[Completion]] = js.undefined
    
    /**
      By default, the completions for the table names will be
      generated from the `schema` object. But if you want to
      customize them, you can pass an array of completions through
      this option.
      */
    var tables: js.UndefOr[js.Array[Completion]] = js.undefined
    
    /**
      When set to true, keyword completions will be upper-case.
      */
    var upperCaseKeywords: js.UndefOr[Boolean] = js.undefined
  }
  object SQLConfig {
    
    inline def apply(): SQLConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SQLConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SQLConfig] (val x: Self) extends AnyVal {
      
      inline def setDefaultSchema(value: String): Self = StObject.set(x, "defaultSchema", value.asInstanceOf[js.Any])
      
      inline def setDefaultSchemaUndefined: Self = StObject.set(x, "defaultSchema", js.undefined)
      
      inline def setDefaultTable(value: String): Self = StObject.set(x, "defaultTable", value.asInstanceOf[js.Any])
      
      inline def setDefaultTableUndefined: Self = StObject.set(x, "defaultTable", js.undefined)
      
      inline def setDialect(value: SQLDialect): Self = StObject.set(x, "dialect", value.asInstanceOf[js.Any])
      
      inline def setDialectUndefined: Self = StObject.set(x, "dialect", js.undefined)
      
      inline def setSchema(value: StringDictionary[js.Array[String | Completion]]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSchemas(value: js.Array[Completion]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      inline def setSchemasVarargs(value: Completion*): Self = StObject.set(x, "schemas", js.Array(value*))
      
      inline def setTables(value: js.Array[Completion]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
      
      inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
      
      inline def setTablesVarargs(value: Completion*): Self = StObject.set(x, "tables", js.Array(value*))
      
      inline def setUpperCaseKeywords(value: Boolean): Self = StObject.set(x, "upperCaseKeywords", value.asInstanceOf[js.Any])
      
      inline def setUpperCaseKeywordsUndefined: Self = StObject.set(x, "upperCaseKeywords", js.undefined)
    }
  }
  
  /**
  Configuration for an [SQL Dialect](https://codemirror.net/6/docs/ref/#lang-sql.SQLDialect).
  */
  trait SQLDialectSpec extends StObject {
    
    /**
      Controls whether regular strings allow backslash escapes.
      */
    var backslashEscapes: js.UndefOr[Boolean] = js.undefined
    
    /**
      A space-separated string of built-in identifiers for the dialect.
      */
    var builtin: js.UndefOr[String] = js.undefined
    
    /**
      Enables strings like `_utf8'str'` or `N'str'`.
      */
    var charSetCasts: js.UndefOr[Boolean] = js.undefined
    
    /**
      When enabled, things quoted with "$$" are treated as
      strings, rather than identifiers.
      */
    var doubleDollarQuotedStrings: js.UndefOr[Boolean] = js.undefined
    
    /**
      When enabled, things quoted with double quotes are treated as
      strings, rather than identifiers.
      */
    var doubleQuotedStrings: js.UndefOr[Boolean] = js.undefined
    
    /**
      Controls whether # creates a line comment.
      */
    var hashComments: js.UndefOr[Boolean] = js.undefined
    
    /**
      The characters that can be used to quote identifiers. Defaults
      to `"\""`.
      */
    var identifierQuotes: js.UndefOr[String] = js.undefined
    
    /**
      A space-separated list of keywords for the dialect.
      */
    var keywords: js.UndefOr[String] = js.undefined
    
    /**
      The set of characters that make up operators. Defaults to
      `"*+\-%<>!=&|~^/"`.
      */
    var operatorChars: js.UndefOr[String] = js.undefined
    
    /**
      Controls whether `//` creates a line comment.
      */
    var slashComments: js.UndefOr[Boolean] = js.undefined
    
    /**
      When enabled `--` comments are only recognized when there's a
      space after the dashes.
      */
    var spaceAfterDashes: js.UndefOr[Boolean] = js.undefined
    
    /**
      The set of characters that start a special variable name.
      Defaults to `"?"`.
      */
    var specialVar: js.UndefOr[String] = js.undefined
    
    /**
      Controls whether bit values can contain other characters than 0 and 1.
      Defaults to false.
      */
    var treatBitsAsBytes: js.UndefOr[Boolean] = js.undefined
    
    /**
      A space-separated string of type names for the dialect.
      */
    var types: js.UndefOr[String] = js.undefined
    
    /**
      Controls whether bit values can be defined as 0b1010. Defaults
      to false.
      */
    var unquotedBitLiterals: js.UndefOr[Boolean] = js.undefined
  }
  object SQLDialectSpec {
    
    inline def apply(): SQLDialectSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SQLDialectSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SQLDialectSpec] (val x: Self) extends AnyVal {
      
      inline def setBackslashEscapes(value: Boolean): Self = StObject.set(x, "backslashEscapes", value.asInstanceOf[js.Any])
      
      inline def setBackslashEscapesUndefined: Self = StObject.set(x, "backslashEscapes", js.undefined)
      
      inline def setBuiltin(value: String): Self = StObject.set(x, "builtin", value.asInstanceOf[js.Any])
      
      inline def setBuiltinUndefined: Self = StObject.set(x, "builtin", js.undefined)
      
      inline def setCharSetCasts(value: Boolean): Self = StObject.set(x, "charSetCasts", value.asInstanceOf[js.Any])
      
      inline def setCharSetCastsUndefined: Self = StObject.set(x, "charSetCasts", js.undefined)
      
      inline def setDoubleDollarQuotedStrings(value: Boolean): Self = StObject.set(x, "doubleDollarQuotedStrings", value.asInstanceOf[js.Any])
      
      inline def setDoubleDollarQuotedStringsUndefined: Self = StObject.set(x, "doubleDollarQuotedStrings", js.undefined)
      
      inline def setDoubleQuotedStrings(value: Boolean): Self = StObject.set(x, "doubleQuotedStrings", value.asInstanceOf[js.Any])
      
      inline def setDoubleQuotedStringsUndefined: Self = StObject.set(x, "doubleQuotedStrings", js.undefined)
      
      inline def setHashComments(value: Boolean): Self = StObject.set(x, "hashComments", value.asInstanceOf[js.Any])
      
      inline def setHashCommentsUndefined: Self = StObject.set(x, "hashComments", js.undefined)
      
      inline def setIdentifierQuotes(value: String): Self = StObject.set(x, "identifierQuotes", value.asInstanceOf[js.Any])
      
      inline def setIdentifierQuotesUndefined: Self = StObject.set(x, "identifierQuotes", js.undefined)
      
      inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setOperatorChars(value: String): Self = StObject.set(x, "operatorChars", value.asInstanceOf[js.Any])
      
      inline def setOperatorCharsUndefined: Self = StObject.set(x, "operatorChars", js.undefined)
      
      inline def setSlashComments(value: Boolean): Self = StObject.set(x, "slashComments", value.asInstanceOf[js.Any])
      
      inline def setSlashCommentsUndefined: Self = StObject.set(x, "slashComments", js.undefined)
      
      inline def setSpaceAfterDashes(value: Boolean): Self = StObject.set(x, "spaceAfterDashes", value.asInstanceOf[js.Any])
      
      inline def setSpaceAfterDashesUndefined: Self = StObject.set(x, "spaceAfterDashes", js.undefined)
      
      inline def setSpecialVar(value: String): Self = StObject.set(x, "specialVar", value.asInstanceOf[js.Any])
      
      inline def setSpecialVarUndefined: Self = StObject.set(x, "specialVar", js.undefined)
      
      inline def setTreatBitsAsBytes(value: Boolean): Self = StObject.set(x, "treatBitsAsBytes", value.asInstanceOf[js.Any])
      
      inline def setTreatBitsAsBytesUndefined: Self = StObject.set(x, "treatBitsAsBytes", js.undefined)
      
      inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setUnquotedBitLiterals(value: Boolean): Self = StObject.set(x, "unquotedBitLiterals", value.asInstanceOf[js.Any])
      
      inline def setUnquotedBitLiteralsUndefined: Self = StObject.set(x, "unquotedBitLiterals", js.undefined)
    }
  }
}
