package typings.azureDashArmDashResource

import typings.azureDashArmDashResource.libFeatureModelsMod.FeatureOperationsListResult
import typings.azureDashArmDashResource.libFeatureModelsMod.FeatureResult
import typings.msDashRest.msDashRestMod.HttpOperationResponse
import typings.msDashRest.msDashRestMod.ServiceCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource/lib/feature/operations", JSImport.Namespace)
@js.native
object libFeatureOperationsMod extends js.Object {
  @js.native
  trait Features extends js.Object {
    /**
      * Gets the preview feature with the specified name.
      *
      * @param {string} resourceProviderNamespace The resource provider namespace
      * for the feature.
      *
      * @param {string} featureName The name of the feature to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {FeatureResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {FeatureResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link FeatureResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(resourceProviderNamespace: String, featureName: String): js.Promise[FeatureResult] = js.native
    def get(resourceProviderNamespace: String, featureName: String, callback: ServiceCallback[FeatureResult]): Unit = js.native
    def get(resourceProviderNamespace: String, featureName: String, options: Anon_CustomHeaders): js.Promise[FeatureResult] = js.native
    def get(
      resourceProviderNamespace: String,
      featureName: String,
      options: Anon_CustomHeaders,
      callback: ServiceCallback[FeatureResult]
    ): Unit = js.native
    /**
      * Gets the preview feature with the specified name.
      *
      * @param {string} resourceProviderNamespace The resource provider namespace
      * for the feature.
      *
      * @param {string} featureName The name of the feature to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<FeatureResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(resourceProviderNamespace: String, featureName: String): js.Promise[HttpOperationResponse[FeatureResult]] = js.native
    def getWithHttpOperationResponse(resourceProviderNamespace: String, featureName: String, options: Anon_CustomHeaders): js.Promise[HttpOperationResponse[FeatureResult]] = js.native
    /**
      * Gets all the preview features in a provider namespace that are available
      * through AFEC for the subscription.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider for getting features.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {FeatureOperationsListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {FeatureOperationsListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link FeatureOperationsListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(resourceProviderNamespace: String): js.Promise[FeatureOperationsListResult] = js.native
    def list(resourceProviderNamespace: String, callback: ServiceCallback[FeatureOperationsListResult]): Unit = js.native
    def list(resourceProviderNamespace: String, options: Anon_CustomHeaders): js.Promise[FeatureOperationsListResult] = js.native
    def list(
      resourceProviderNamespace: String,
      options: Anon_CustomHeaders,
      callback: ServiceCallback[FeatureOperationsListResult]
    ): Unit = js.native
    /**
      * Gets all the preview features that are available through AFEC for the
      * subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {FeatureOperationsListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {FeatureOperationsListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link FeatureOperationsListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAll(): js.Promise[FeatureOperationsListResult] = js.native
    def listAll(callback: ServiceCallback[FeatureOperationsListResult]): Unit = js.native
    def listAll(options: Anon_CustomHeaders): js.Promise[FeatureOperationsListResult] = js.native
    def listAll(options: Anon_CustomHeaders, callback: ServiceCallback[FeatureOperationsListResult]): Unit = js.native
    /**
      * Gets all the preview features that are available through AFEC for the
      * subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {FeatureOperationsListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {FeatureOperationsListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link FeatureOperationsListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAllNext(nextPageLink: String): js.Promise[FeatureOperationsListResult] = js.native
    def listAllNext(nextPageLink: String, callback: ServiceCallback[FeatureOperationsListResult]): Unit = js.native
    def listAllNext(nextPageLink: String, options: Anon_CustomHeaders): js.Promise[FeatureOperationsListResult] = js.native
    def listAllNext(
      nextPageLink: String,
      options: Anon_CustomHeaders,
      callback: ServiceCallback[FeatureOperationsListResult]
    ): Unit = js.native
    /**
      * Gets all the preview features that are available through AFEC for the
      * subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<FeatureOperationsListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAllNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[FeatureOperationsListResult]] = js.native
    def listAllNextWithHttpOperationResponse(nextPageLink: String, options: Anon_CustomHeaders): js.Promise[HttpOperationResponse[FeatureOperationsListResult]] = js.native
    /**
      * Gets all the preview features that are available through AFEC for the
      * subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<FeatureOperationsListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAllWithHttpOperationResponse(): js.Promise[HttpOperationResponse[FeatureOperationsListResult]] = js.native
    def listAllWithHttpOperationResponse(options: Anon_CustomHeaders): js.Promise[HttpOperationResponse[FeatureOperationsListResult]] = js.native
    /**
      * Gets all the preview features in a provider namespace that are available
      * through AFEC for the subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {FeatureOperationsListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {FeatureOperationsListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link FeatureOperationsListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[FeatureOperationsListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[FeatureOperationsListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: Anon_CustomHeaders): js.Promise[FeatureOperationsListResult] = js.native
    def listNext(
      nextPageLink: String,
      options: Anon_CustomHeaders,
      callback: ServiceCallback[FeatureOperationsListResult]
    ): Unit = js.native
    /**
      * Gets all the preview features in a provider namespace that are available
      * through AFEC for the subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<FeatureOperationsListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[FeatureOperationsListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: Anon_CustomHeaders): js.Promise[HttpOperationResponse[FeatureOperationsListResult]] = js.native
    /**
      * Gets all the preview features in a provider namespace that are available
      * through AFEC for the subscription.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider for getting features.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<FeatureOperationsListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(resourceProviderNamespace: String): js.Promise[HttpOperationResponse[FeatureOperationsListResult]] = js.native
    def listWithHttpOperationResponse(resourceProviderNamespace: String, options: Anon_CustomHeaders): js.Promise[HttpOperationResponse[FeatureOperationsListResult]] = js.native
    /**
      * Registers the preview feature for the subscription.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} featureName The name of the feature to register.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {FeatureResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {FeatureResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link FeatureResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def register(resourceProviderNamespace: String, featureName: String): js.Promise[FeatureResult] = js.native
    def register(resourceProviderNamespace: String, featureName: String, callback: ServiceCallback[FeatureResult]): Unit = js.native
    def register(resourceProviderNamespace: String, featureName: String, options: Anon_CustomHeaders): js.Promise[FeatureResult] = js.native
    def register(
      resourceProviderNamespace: String,
      featureName: String,
      options: Anon_CustomHeaders,
      callback: ServiceCallback[FeatureResult]
    ): Unit = js.native
    /**
      * Registers the preview feature for the subscription.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} featureName The name of the feature to register.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<FeatureResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def registerWithHttpOperationResponse(resourceProviderNamespace: String, featureName: String): js.Promise[HttpOperationResponse[FeatureResult]] = js.native
    def registerWithHttpOperationResponse(resourceProviderNamespace: String, featureName: String, options: Anon_CustomHeaders): js.Promise[HttpOperationResponse[FeatureResult]] = js.native
  }
  
}

