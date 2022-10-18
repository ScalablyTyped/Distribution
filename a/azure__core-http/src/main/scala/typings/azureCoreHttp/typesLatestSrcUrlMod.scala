package typings.azureCoreHttp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcUrlMod {
  
  @JSImport("@azure/core-http/types/latest/src/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/url", "URLBuilder")
  @js.native
  open class URLBuilder () extends StObject {
    
    /* private */ var _host: Any = js.native
    
    /* private */ var _path: Any = js.native
    
    /* private */ var _port: Any = js.native
    
    /* private */ var _query: Any = js.native
    
    /* private */ var _scheme: Any = js.native
    
    /**
      * Append the provided path to this URL's existing path. If the provided path contains a query,
      * then it will be added to this URL as well.
      */
    def appendPath(): Unit = js.native
    def appendPath(path: String): Unit = js.native
    
    /**
      * Get the host that has been set in this URL.
      */
    def getHost(): js.UndefOr[String] = js.native
    
    /**
      * Get the path that has been set in this URL.
      */
    def getPath(): js.UndefOr[String] = js.native
    
    /**
      * Get the port that has been set in this URL.
      */
    def getPort(): js.UndefOr[String] = js.native
    
    /**
      * Get the query in this URL.
      */
    def getQuery(): js.UndefOr[String] = js.native
    
    /**
      * Get the value of the query parameter with the provided query parameter name. If no query
      * parameter exists with the provided name, then undefined will be returned.
      */
    def getQueryParameterValue(queryParameterName: String): js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Get the scheme that has been set in this URL.
      */
    def getScheme(): js.UndefOr[String] = js.native
    
    /**
      * If the provided searchValue is found in this URLBuilder, then replace it with the provided
      * replaceValue.
      */
    def replaceAll(searchValue: String, replaceValue: String): Unit = js.native
    
    /**
      * Set the parts of this URL by parsing the provided text using the provided startState.
      */
    /* private */ var set: Any = js.native
    
    /**
      * Set the host for this URL. If the provided host contains other parts of a URL (such as a
      * port, path, or query), those parts will be added to this URL as well.
      */
    def setHost(): Unit = js.native
    def setHost(host: String): Unit = js.native
    
    /**
      * Set the path for this URL. If the provided path contains a query, then it will be added to
      * this URL as well.
      */
    def setPath(): Unit = js.native
    def setPath(path: String): Unit = js.native
    
    /**
      * Set the port for this URL. If the provided port contains other parts of a URL (such as a
      * path or query), those parts will be added to this URL as well.
      */
    def setPort(): Unit = js.native
    def setPort(port: String): Unit = js.native
    def setPort(port: Double): Unit = js.native
    
    /**
      * Set the query in this URL.
      */
    def setQuery(): Unit = js.native
    def setQuery(query: String): Unit = js.native
    
    /**
      * Set a query parameter with the provided name and value in this URL's query. If the provided
      * query parameter value is undefined or empty, then the query parameter will be removed if it
      * existed.
      */
    def setQueryParameter(queryParameterName: String, queryParameterValue: Any): Unit = js.native
    
    /**
      * Set the scheme/protocol for this URL. If the provided scheme contains other parts of a URL
      * (such as a host, port, path, or query), those parts will be added to this URL as well.
      */
    def setScheme(): Unit = js.native
    def setScheme(scheme: String): Unit = js.native
  }
  /* static members */
  object URLBuilder {
    
    @JSImport("@azure/core-http/types/latest/src/url", "URLBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a given string URL into a new {@link URLBuilder}.
      */
    inline def parse(text: String): URLBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[URLBuilder]
  }
  
  @JSImport("@azure/core-http/types/latest/src/url", "URLQuery")
  @js.native
  open class URLQuery () extends StObject {
    
    /* private */ val _rawQuery: Any = js.native
    
    /**
      * Get whether or not there any query parameters in this URLQuery.
      */
    def any(): Boolean = js.native
    
    /**
      * Get the value of the query parameter with the provided name. If no parameter exists with the
      * provided parameter name, then undefined will be returned.
      */
    def get(parameterName: String): js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Get the keys of the query string.
      */
    def keys(): js.Array[String] = js.native
    
    /**
      * Set a query parameter with the provided name and value. If the parameterValue is undefined or
      * empty, then this will attempt to remove an existing query parameter with the provided
      * parameterName.
      */
    def set(parameterName: String, parameterValue: Any): Unit = js.native
  }
  /* static members */
  object URLQuery {
    
    @JSImport("@azure/core-http/types/latest/src/url", "URLQuery")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse a URLQuery from the provided text.
      */
    inline def parse(text: String): URLQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[URLQuery]
  }
  
  @JSImport("@azure/core-http/types/latest/src/url", "URLToken")
  @js.native
  open class URLToken protected () extends StObject {
    def this(text: String, `type`: URLTokenType) = this()
    
    val text: String = js.native
    
    val `type`: URLTokenType = js.native
  }
  /* static members */
  object URLToken {
    
    @JSImport("@azure/core-http/types/latest/src/url", "URLToken")
    @js.native
    val ^ : js.Any = js.native
    
    inline def host(text: String): URLToken = ^.asInstanceOf[js.Dynamic].applyDynamic("host")(text.asInstanceOf[js.Any]).asInstanceOf[URLToken]
    
    inline def path(text: String): URLToken = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(text.asInstanceOf[js.Any]).asInstanceOf[URLToken]
    
    inline def port(text: String): URLToken = ^.asInstanceOf[js.Dynamic].applyDynamic("port")(text.asInstanceOf[js.Any]).asInstanceOf[URLToken]
    
    inline def query(text: String): URLToken = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(text.asInstanceOf[js.Any]).asInstanceOf[URLToken]
    
    inline def scheme(text: String): URLToken = ^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(text.asInstanceOf[js.Any]).asInstanceOf[URLToken]
  }
  
  @JSImport("@azure/core-http/types/latest/src/url", "URLTokenizer")
  @js.native
  open class URLTokenizer protected () extends StObject {
    def this(_text: String) = this()
    def this(_text: String, state: URLTokenizerState) = this()
    
    var _currentIndex: Double = js.native
    
    var _currentState: URLTokenizerState = js.native
    
    var _currentToken: js.UndefOr[URLToken] = js.native
    
    val _text: String = js.native
    
    val _textLength: Double = js.native
    
    /**
      * Get the current URLToken this URLTokenizer is pointing at, or undefined if the URLTokenizer
      * hasn't started or has finished tokenizing.
      */
    def current(): js.UndefOr[URLToken] = js.native
    
    /**
      * Advance to the next URLToken and return whether or not a URLToken was found.
      */
    def next(): Boolean = js.native
  }
  
  inline def isAlphaNumericCharacter(character: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphaNumericCharacter")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureCoreHttp.azureCoreHttpStrings.SCHEME
    - typings.azureCoreHttp.azureCoreHttpStrings.HOST
    - typings.azureCoreHttp.azureCoreHttpStrings.PORT
    - typings.azureCoreHttp.azureCoreHttpStrings.PATH
    - typings.azureCoreHttp.azureCoreHttpStrings.QUERY
  */
  trait URLTokenType extends StObject
  object URLTokenType {
    
    inline def HOST: typings.azureCoreHttp.azureCoreHttpStrings.HOST = "HOST".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.HOST]
    
    inline def PATH: typings.azureCoreHttp.azureCoreHttpStrings.PATH = "PATH".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.PATH]
    
    inline def PORT: typings.azureCoreHttp.azureCoreHttpStrings.PORT = "PORT".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.PORT]
    
    inline def QUERY: typings.azureCoreHttp.azureCoreHttpStrings.QUERY = "QUERY".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.QUERY]
    
    inline def SCHEME: typings.azureCoreHttp.azureCoreHttpStrings.SCHEME = "SCHEME".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.SCHEME]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureCoreHttp.azureCoreHttpStrings.SCHEME
    - typings.azureCoreHttp.azureCoreHttpStrings.SCHEME_OR_HOST
    - typings.azureCoreHttp.azureCoreHttpStrings.HOST
    - typings.azureCoreHttp.azureCoreHttpStrings.PORT
    - typings.azureCoreHttp.azureCoreHttpStrings.PATH
    - typings.azureCoreHttp.azureCoreHttpStrings.QUERY
    - typings.azureCoreHttp.azureCoreHttpStrings.DONE
  */
  trait URLTokenizerState extends StObject
  object URLTokenizerState {
    
    inline def DONE: typings.azureCoreHttp.azureCoreHttpStrings.DONE = "DONE".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.DONE]
    
    inline def HOST: typings.azureCoreHttp.azureCoreHttpStrings.HOST = "HOST".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.HOST]
    
    inline def PATH: typings.azureCoreHttp.azureCoreHttpStrings.PATH = "PATH".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.PATH]
    
    inline def PORT: typings.azureCoreHttp.azureCoreHttpStrings.PORT = "PORT".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.PORT]
    
    inline def QUERY: typings.azureCoreHttp.azureCoreHttpStrings.QUERY = "QUERY".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.QUERY]
    
    inline def SCHEME: typings.azureCoreHttp.azureCoreHttpStrings.SCHEME = "SCHEME".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.SCHEME]
    
    inline def SCHEME_OR_HOST: typings.azureCoreHttp.azureCoreHttpStrings.SCHEME_OR_HOST = "SCHEME_OR_HOST".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.SCHEME_OR_HOST]
  }
}
